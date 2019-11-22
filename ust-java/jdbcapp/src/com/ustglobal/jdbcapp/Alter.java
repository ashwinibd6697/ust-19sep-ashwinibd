package com.ustglobal.jdbcapp;
import java.sql.*;
//import com.mysql.jdbc.Driver;
public class Alter {
public static void main(String[] args) {
	Connection conn=null;
	Statement stmt=null;
	try {
//		Driver d = new Driver();
//		DriverManager.registerDriver(d);
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn=DriverManager.getConnection(url);
		
		
//		String sql="alter table employee add column dad int";
		String sql="alter table employee  drop column dad";
		stmt=conn.createStatement();
		int c=stmt.executeUpdate(sql);
		
		
		System.out.println(c+" column added");
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) conn.close();
			if(stmt!=null) stmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
	}
}
}
}