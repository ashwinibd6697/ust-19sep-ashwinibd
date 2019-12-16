package com.ustglobal.jdbcapp;


import java.sql.*;

import com.mysql.jdbc.Driver;

public class DynamicUpdate {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt =null;
	
		try {
			//step 1 load the driver
//			Driver  driver =new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//Step2 Get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			conn=DriverManager.getConnection(url);
			
			
			//step 3 issue SQL Query
			
			String sql ="update employee set name=?, sal=?, gender = ? where id=?";
			stmt=conn.prepareStatement(sql);

			String eid =args[0];
			int id = Integer.parseInt(eid);
			
			
			String ename =args[1];
		
			
			String salary =args[2];
			int sal = Integer.parseInt(salary);
			
			
			String gen =args[3];
						
			
			stmt.setInt(4, id);
			stmt.setString(1, ename);
			stmt.setInt(2, sal);
			stmt.setString(3, gen);
			int count = stmt.executeUpdate();
			
	
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
