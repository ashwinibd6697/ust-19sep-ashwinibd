package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class Delete {
public static void main(String[] args) {
	Connection conn=null;
	Statement stmt=null;
	
	try {
//		Driver d = new Driver();
//		DriverManager.registerDriver(d);
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		
		conn=DriverManager.getConnection(url);
		
		
		String sql="delete from employee where id=6";
		stmt=conn.createStatement();
		int count=stmt.executeUpdate(sql);
		
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