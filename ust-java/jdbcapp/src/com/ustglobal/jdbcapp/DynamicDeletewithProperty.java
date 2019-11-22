package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicDeletewithProperty {
public static void main(String[] args) {
	Connection conn=null;
	PreparedStatement stmt=null;
   FileReader reader =null;	
	try {
reader=new FileReader("db.properties");
		Properties p = new Properties();
		p.load(reader);
		
		//step 1 load the driver
//		Driver  driver =new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName(p.getProperty("d"));
		//Step2 Get the connection
		String url=p.getProperty("url");
		
		conn=DriverManager.getConnection(url,p);
		
		
		//step 3 issue SQL Query
        //String sql ="insert into employee values("+args[0]+",'"+args[1]+"',"+args[2]+",'"+args[4]+"');
		
		String sql =p.getProperty("delete");
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