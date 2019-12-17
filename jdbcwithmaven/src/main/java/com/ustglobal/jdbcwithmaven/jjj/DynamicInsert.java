package com.ustglobal.jdbcwithmaven.jjj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicInsert {
	public static void main(String[] args) {
		Connection conn = null;
//		Statement stmt =null;
		PreparedStatement pstmt=null;
	
		try {
			//step 1 load the driver
//			Driver  driver =new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//Step2 Get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			conn=DriverManager.getConnection(url);			
			String sql ="insert into employee values(?,?,?,?)";
			pstmt =conn.prepareStatement(sql);
			String eid =args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);
			String ename =args[1];
			pstmt.setString(2, ename);
			String salary =args[2];
			int sal = Integer.parseInt(salary);
			pstmt.setInt(3, sal);
			String gen =args[3];
			pstmt.setString(4, gen);
			int count = pstmt.executeUpdate();
			System.out.println(count+"Rows inserted");
   
		}catch(Exception e) {
			e.printStackTrace();
		}finally {try {
			if(conn!=null) conn.close();
			if(pstmt!=null) pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}//main ends
}
