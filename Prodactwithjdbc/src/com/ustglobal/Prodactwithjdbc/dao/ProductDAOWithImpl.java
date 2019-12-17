 package com.ustglobal.Prodactwithjdbc.dao;

import java.sql.*;


import java.util.ArrayList;
import java.util.List;
import com.ustglobal.Prodactwithjdbc.dto.ProductBean;

public class ProductDAOWithImpl implements  ProductDAO {
  String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
  Connection conn=null;
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  Statement stmt =null;
	
	@Override
	public List<ProductBean> retriveProducts() {
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   conn=DriverManager.getConnection(url);
		   stmt=conn.createStatement();
		   String sql ="select * from product";
		   rs=stmt.executeQuery(sql);
		   ArrayList<ProductBean> result =new ArrayList<ProductBean>(); 
		   while(rs.next()) {
			   ProductBean b = new ProductBean();
			   b.setPid(rs.getInt("pid"));
			   b.setPname(rs.getString("pname"));
			   b.setQuantity(rs.getInt("quantity"));
			   result.add(b);
		   }
	          return result;	   
	   }catch(Exception e) {
		   e.printStackTrace();
		   return null;
	   }finally{
		   try {
		   if(conn!=null) conn.close();
		   if(stmt!=null) stmt.close();
		   if(rs!=null) rs.close();
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	   }
		
		}

	@Override
	public ProductBean searchProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertProduct(ProductBean b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteProduct(ProductBean b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateProduct(ProductBean b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
