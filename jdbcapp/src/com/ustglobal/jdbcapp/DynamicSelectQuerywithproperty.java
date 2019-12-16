package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DynamicSelectQuerywithproperty {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt =null;
		ResultSet rs =null;
		FileReader reader=null;

		try {
			reader = new FileReader("db.properties");	
			Properties p = new Properties();
			p.load(reader);



			//step 1 load the driver
			//			Driver  driver =new Driver();
			//			DriverManager.registerDriver(driver);
			Class.forName(p.getProperty("d"));
			//step 2 get the connection with RDMS

			String url =p.getProperty("url");
			conn =DriverManager.getConnection(url,p);


			//			String url ="jdbc:mysql://localhost:3306/ust_ty_db";
			//			conn =DriverManager.getConnection(url, "root", "root");

			//Step 2 issue SQL Query						
			stmt = conn.createStatement();
			String sql =p.getProperty("q");
			rs=stmt.executeQuery(sql);


			// step 4 Read the Result
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("id     : "+id);
				System.out.println("name   : "+name);
				System.out.println("salary : "+sal);
				System.out.println("gender : "+gender);

				System.out.println("************************");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {

			//Step 5 close all jdbc object
			try{
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
				if(rs!=null) rs.close();
				if(reader!=null) reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//finally block ends
	}//main ends
}
