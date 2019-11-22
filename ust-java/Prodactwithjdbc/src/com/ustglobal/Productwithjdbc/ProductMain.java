package com.ustglobal.Productwithjdbc;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.Prodactwithjdbc.dao.ProductDAO;
import com.ustglobal.Prodactwithjdbc.dto.ProductBean;
import com.ustglobal.Prodactwithjdbc.util.ProductManager;

public class ProductMain {
	public static void main(String[] args) {

		System.out.println("1 for retrive data");
		System.out.println("2 for insert data");
		System.out.println("3 for delete data");
		System.out.println("4 for search data");
		System.out.println("5 for update data");

		Scanner sc = new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			    ProductDAO p = ProductManager.getInstance();
			   List<ProductBean> result=p.retriveProducts();
			   
			   for(ProductBean pb : result) {
			   System.out.println("pid----"+pb.getPid());
			   System.out.println("pname--"+pb.getPname());
			   System.out.println("quantity--"+pb.getQuantity());
			    }
			  break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;



		}
	}
}
