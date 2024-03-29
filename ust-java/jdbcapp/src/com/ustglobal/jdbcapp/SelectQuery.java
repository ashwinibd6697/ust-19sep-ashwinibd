package com.ustglobal.jdbcapp;
import java.sql.*;

import com.mysql.jdbc.Driver;


public class SelectQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt =null;
		ResultSet rs =null;
		try {
			//step 1 load the driver
//			Driver  driver =new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//step 2 get the connection with RDMS
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn =DriverManager.getConnection(url);
			
			
//			String url ="jdbc:mysql://localhost:3306/ust_ty_db";
//			conn =DriverManager.getConnection(url, "root", "root");
					
			//Step 2 issue SQL Query						
			stmt = conn.createStatement();
			String sql ="select * from employee";
			rs=stmt.executeQuery(sql);
			
			
			// step 4 Read the Result
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("id     : "+id);
				System.out.println("name   : "+name);
				System.out.println("salary : "+sal);
				System.out.println("gender : "+gender);

				System.out.println("************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//Step 5 close all jdbc object
			try{
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
				if(rs!=null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}//finally block ends
	}//main ends
}//class ends
     