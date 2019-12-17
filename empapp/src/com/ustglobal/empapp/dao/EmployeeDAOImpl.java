package com.ustglobal.empapp.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{
	String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	Connection conn= null;
	Statement stmt = null;
	java.sql.PreparedStatement pstmt=null;
	ResultSet rs= null;
	
	public List<EmployeeBean> getdata() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();

			String sql= "select * from employee";
			rs=stmt.executeQuery(sql);
			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id=rs.getInt("id");
				bean.setId(id);
			String name=rs.getString("name");
			  bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSalary(sal);
		     String gender=rs.getString("gender");
		       bean.setGender(gender);
				result.add(bean);
 			}
			return result;
		}catch(Exception e ) {
			e.printStackTrace();
			return null;
		}finally {
			try{
				if(conn!= null) conn.close();

				if(stmt!=null) stmt.close();
				if(rs!= null) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public EmployeeBean searchEmployeeData(int id) {
		String sql ="select * from Employee where id =?";
	 
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id1=rs.getInt("id");
				bean.setId(id1);
			String name=rs.getString("name");
			  bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSalary(sal);
		     String gender=rs.getString("gender");
		       bean.setGender(gender);
		      return bean;
			}else {
				return null;
			}
		   
	   }catch(Exception e ) {
			e.printStackTrace();
			return null;
	
		}finally {
			try{
				if(conn!= null) conn.close();

				if(pstmt!=null) pstmt.close();
				if(rs!= null) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	
	
	
	
	}//end of search method
	public int insertData(EmployeeBean b) {
		String sql= "insert into employee values(?,?,?,?)";
		try {
			int id =b.getId();
			String name = b.getName();
			int sal =b.getSalary();
			String gender=b.getGender();
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, sal);
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			return count;
		}catch(Exception e ) {
			e.printStackTrace();
		    return (Integer) null;	
	
		}finally {
			try{
				if(conn!= null) conn.close();

				if(pstmt!=null) pstmt.close();
				if(rs!= null) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
	}
	public int updataData(EmployeeBean b) {
		String sql= "update employee set name=?,sal=?,gender=? where id=?";
		try {
			int id =b.getId();
			String name = b.getName();
			int sal =b.getSalary();
			String gender=b.getGender();
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			return count;
		}catch(Exception e ) {
			e.printStackTrace();
		    return (Integer) null;	
	
		}finally {
			try{
				if(conn!= null) conn.close();

				if(pstmt!=null) pstmt.close();
				if(rs!= null) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
	}//emd of update
	public int deleteData(EmployeeBean b) {
		String sql= "delete from employee where id=?";
		try {
			int id =b.getId();
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			
			int count = pstmt.executeUpdate();
			return count;
		}catch(Exception e ) {
			e.printStackTrace();
		    return (Integer) null;	
	
		}finally {
			try{
				if(conn!= null) conn.close();

				if(pstmt!=null) pstmt.close();
				if(rs!= null) rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	
	}//emd of delete
}

