package com.ustglobal.jdbcwithmaven.jjj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt =null;
		ResultSet rs =null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
						
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn =DriverManager.getConnection(url);				
			stmt = conn.createStatement();
			String sql ="select * from employee";
			rs=stmt.executeQuery(sql);
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
			try{
				if(conn!=null) conn.close();
				if(stmt!=null) stmt.close();
				if(rs!=null) rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
