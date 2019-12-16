package com.ustglobal.jdbcapp;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicInsertQueryProperties {
	public static void main(String[] args) {
		Connection conn = null;
//		Statement stmt =null;
		PreparedStatement pstmt=null;
	    FileReader reader = null;
		try {
			reader=new FileReader("db.properties");
			Properties p = new Properties();
			p.load(reader);
			
			//step 1 load the driver
//			Driver  driver =new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(p.getProperty("d"));
			//Step2 Get the connection
			String url=p.getProperty("url");
			
			conn=DriverManager.getConnection(url,p);
			
			
			//step 3 issue SQL Query
            //String sql ="insert into employee values("+args[0]+",'"+args[1]+"',"+args[2]+",'"+args[4]+"');
			
			String sql =p.getProperty("insert");
			//stmt=conn.createStatement();
			
			pstmt =conn.prepareStatement(sql);
			
			String eid =args[0];
			int id = Integer.parseInt(eid);
			pstmt.setInt(1, id);
			
			String ename =args[1];
			pstmt.setString(2, ename);
			
			String salary =args[2];
			int sal = Integer.parseInt(salary);
			pstmt.setInt(3, sal);
			
			String gen =args[3];
			pstmt.setString(4, gen);
			
			
			
			
			
			
			
			int count = pstmt.executeUpdate();
			
			//step 4 read thre result
			System.out.println(count+"Rows inserted");
   
		}catch(Exception e) {
			e.printStackTrace();
		}finally {try {
			if(conn!=null) conn.close();
			if(pstmt!=null) pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		}
	}//main ends

	
}
