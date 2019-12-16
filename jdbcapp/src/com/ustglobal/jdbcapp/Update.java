package com.ustglobal.jdbcapp;


import java.sql.*;


//import com.mysql.jdbc.Driver;

public class Update {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt =null;
	
		try {
			//step 1 load the driver
//			Driver  driver =new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//Step2 Get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			conn=DriverManager.getConnection(url);
			
			
			//step 3 issue SQL Query
			
			String sql ="update employee set name='ABC', sal=50, gender = 'F' where id=6";
			stmt=conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step 4 read thre result
			System.out.println(count+"Rows updated");
   
		}catch(Exception e) {
			e.printStackTrace();
		}finally {try {
			if(conn!=null) conn.close();
			if(stmt!=null) stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}//main ends

	
}
