package com.ustglobal.jdbcwithmaven.jjj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement stmt=null;
		
		try {

	 Class.forName("com.mysql.jdbc.Driver");	
			String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			conn=DriverManager.getConnection(url);
			
			
			String sql="delete from employee where id=?";

			stmt=conn.prepareStatement(sql);
			
			
			stmt.setInt(1,Integer.parseInt(args[0]));
			
			int count=stmt.executeUpdate();
			
			System.out.println(count+"row is deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
		}
	}
	}
}
