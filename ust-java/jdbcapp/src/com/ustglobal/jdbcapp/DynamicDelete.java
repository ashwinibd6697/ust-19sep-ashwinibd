package com.ustglobal.jdbcapp;

import java.sql.*;

//import com.mysql.jdbc.Driver;

public class DynamicDelete {
public static void main(String[] args) {
	Connection conn=null;
	PreparedStatement stmt=null;
	
	try {
//		Driver d = new Driver();
//		DriverManager.registerDriver(d);
 Class.forName("com.mysql.jdbc.Driver");	
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		
		conn=DriverManager.getConnection(url);
		
		
		String sql="delete from employee where id=?";
//		stmt=conn.createStatement();
		stmt=conn.prepareStatement(sql);
//		String eid =args[0];
//		int id = Integer.parseInt(eid);
//		stmt.setInt(1, id);
		
		
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