package com.ustglobal.empapp;

import java.util.List;

import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;


public class App {
	public static void main(String[] args) {
		System.out.println("1 for employee data");
		System.out.println("2 for insert data");
		System.out.println("3 for update data");
		System.out.println("4 for delete data");
		System.out.println("5 for search single empp data");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch(ch) {

		case 1 :
			EmployeeDAO e = EmployeeManager.getInstance();
			List<EmployeeBean> result =e.getdata();

			for (EmployeeBean bean : result) {
				System.out.println("id       :"+bean.getId());
				System.out.println("Name     :"+bean.getName());
				System.out.println("Salary   :"+bean.getSalary());
				System.out.println("gender   :"+bean.getGender());

			}
			break;
		case 2 :
			EmployeeDAO e2 = EmployeeManager.getInstance();
			System.out.println("enter details to insert");
			/*
			 * int id = sc.nextInt(); String name = sc.nextLine(); int sal = sc.nextInt();
			 * 
			 * String gen = sc.nextLine();
			 */
			EmployeeBean b = new EmployeeBean();
			b.setId(sc.nextInt());
			b.setName(sc.next());
			b.setSalary(sc.nextInt());
			b.setGender(sc.next());
			int count=e2.insertData(b);
			System.out.println(count+"rows inserted");
			break;
			
			
		case 3:
			EmployeeDAO e3= EmployeeManager.getInstance();
			System.out.println("enter details to update ");
			/*
			 * int id1 = sc.nextInt(); String name1 = sc.nextLine(); int sal1 =
			 * sc.nextInt();
			 * 
			 * String gen1 = sc.nextLine();
			 */
			EmployeeBean b1 = new EmployeeBean();
			b1.setId(sc.nextInt());
			b1.setName(sc.nextLine());
			b1.setSalary(sc.nextInt());
			b1.setGender(sc.nextLine());
			int count1=e3.updataData(b1);
			System.out.println(count1+"rows updated");
			break;			
	
			
		case 4:
			EmployeeDAO e4=EmployeeManager.getInstance();
			EmployeeBean b2 = new EmployeeBean();
			System.out.println("enter the id to delete");
			b2.setId(sc.nextInt());

			int c=e4.deleteData(b2);
			System.out.println(c+"rows deleted");
			break;
			
		case 5 :
			EmployeeDAO e1 = EmployeeManager.getInstance();
			System.out.println("enter id");
			int id5 = sc.nextInt();
			EmployeeBean bean =e1.searchEmployeeData(id5);

			if(bean!=null) {
				System.out.println("id       :"+bean.getId());
				System.out.println("Name     :"+bean.getName());
				System.out.println("Salary   :"+bean.getSalary());
				System.out.println("gender   :"+bean.getGender());

			}else {
				System.out.println("No data Found");
			}
			break;


		}//end of switch



	}//end of main

}//end of class