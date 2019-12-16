package com.ustglobal.jdbcapp;


import java.sql.*;

import com.mysql.jdbc.Driver;
//import com.mysql.jdbc.PreparedStatement;

public class DynamicSelectQuery {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql ="select * from employee where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		try {
              //step 1
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//step2
			
			conn=DriverManager.getConnection(url);
          
			//step3
			
			pstmt = conn.prepareStatement(sql);

			String eid= args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1,id);

			rs=pstmt.executeQuery();


			//step 4

			if(rs.next()) {
				int id1=rs.getInt("id");
				int sal = rs.getInt("sal");
				String n =rs.getString("sal");
				String g = rs.getString("gender");

				System.out.println("id     : "+id1);
				System.out.println("name   : "+n);
				System.out.println("salary : "+sal);
				System.out.println("gender : "+g);

				System.out.println("************************");
			}

		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			try {//step 5
				if(conn!=null) conn.close();
				if(pstmt!=null) pstmt.close();
				if(rs!=null) rs.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
}
