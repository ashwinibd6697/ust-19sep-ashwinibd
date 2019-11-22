package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;



public class InsertWithTryResources2 {
public static void main(String[] args) {
	

	try(FileReader reader = new FileReader("db.properties")){
		
		Properties p = new Properties();
		p.load(reader);
		Class.forName(p.getProperty("d"));
		
		String url = p.getProperty("url");
		String sql = p.getProperty("insert");
		try (Connection conn=DriverManager.getConnection(url,p);
			PreparedStatement pstmt =conn.prepareStatement(sql)){
			
			
			String eid=args[0]	;
			int id=Integer.parseInt(eid);
			pstmt.setInt(1,id);
			
			String name=args[1]	;
			pstmt.setString(2,name);
			
			String salary=args[2]	;
			int sal=Integer.parseInt(salary);
			pstmt.setInt(3,sal);
			
			String gender=args[3]	;
			pstmt.setString(4,gender);
			
			int count  =pstmt.executeUpdate();
		System.out.println(count+"rows updated");
			
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
	
}
