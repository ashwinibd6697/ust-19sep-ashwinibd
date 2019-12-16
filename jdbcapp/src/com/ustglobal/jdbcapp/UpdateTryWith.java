package com.ustglobal.jdbcapp;



import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateTryWith {
	public static void main(String[] args) {


		try(FileReader reader=new FileReader("db.properties")){

			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("d"));

			String url=prop.getProperty("url");
			String sql=prop.getProperty("update");

			try(Connection conn=DriverManager.getConnection(url,prop);
					PreparedStatement pstmt=conn.prepareStatement(sql)
					){

				String eid=args[0]	;
				int id=Integer.parseInt(eid);


				String name=args[1]	;


				String salary=args[2]	;
				int sal=Integer.parseInt(salary);


				String gender=args[3]	;


				pstmt.setInt(4,id);
				pstmt.setString(1,name);
				pstmt.setInt(2,sal);
				pstmt.setString(3,gender);

				int count=pstmt.executeUpdate();
				System.out.println(count+" updated");

			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
