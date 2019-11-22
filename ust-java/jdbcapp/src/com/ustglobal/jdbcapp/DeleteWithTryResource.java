package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

public class DeleteWithTryResource {
	public static void main(String[] args) {
		
		
		try(FileReader reader=new FileReader("db.properties")){
			
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("d"));
			
			String url=prop.getProperty("url");
			String sql=prop.getProperty("delete");
			
			try(Connection conn=DriverManager.getConnection(url,prop);
				PreparedStatement pstmt=conn.prepareStatement(sql);
					){
				
				String eid=args[0]	;
				int id=Integer.parseInt(eid);
				pstmt.setInt(1,id);
				
				int count=pstmt.executeUpdate();
				System.out.println(count+" deleted");
				
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
