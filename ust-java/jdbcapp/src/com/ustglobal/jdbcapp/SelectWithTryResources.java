package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class SelectWithTryResources {
public static void main(String[] args) {
	

	try(FileReader reader = new FileReader("db.properties")){
		
		Properties p = new Properties();
		p.load(reader);
		Class.forName(p.getProperty("d"));
		String url = p.getProperty("url");
		String sql = p.getProperty("q");
		try (Connection conn=DriverManager.getConnection(url,p);
				Statement stmt=conn.createStatement();
				 ResultSet rs =stmt.executeQuery(sql)){
			
			while(rs.next()) {
				System.out.println("id       :"+rs.getInt("id"));
				System.out.println("Name     :"+rs.getString("name"));
				System.out.println("Salary   :"+rs.getInt("sal"));
				System.out.println("gender   :"+rs.getString("gender"));
			}
			
			
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
	
}
