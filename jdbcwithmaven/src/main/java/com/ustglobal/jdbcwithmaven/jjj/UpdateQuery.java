package com.ustglobal.jdbcwithmaven.jjj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
 
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt =null;
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			conn=DriverManager.getConnection(url);
			
			
			
			
			String sql ="update employee set name='ABC', sal=50, gender = 'F' where id=6";
			stmt=conn.createStatement();
			int count = stmt.executeUpdate(sql);
			

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
	}	
}
