package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import com.mysql.jdbc.Driver;

public class InsertCSVFile {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="insert into employee values(?,?,?,?)";
		
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection conn =DriverManager.getConnection(url);
				PreparedStatement pstmt = conn.prepareStatement(sql)){

		while(reader.ready()) {
			String line = reader.readLine();
			String[] w = line.split(",");
			  
			int id = Integer.parseInt(w[0]);
			String name =w[1];
			int sal = Integer.parseInt(w[2]);
			String gen =w[3];
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, sal);
			pstmt.setString(4, gen);
			
//			int count= pstmt.executeUpdate();
//			System.out.println(count+" Row(S) insertedd");
             pstmt.addBatch();
		}
         int [] count = pstmt.executeBatch();
         System.out.println(count.length+" ROW(S) executed ");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
