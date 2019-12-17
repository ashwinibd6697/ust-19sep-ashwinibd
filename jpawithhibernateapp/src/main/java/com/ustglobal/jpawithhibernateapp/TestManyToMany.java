package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {

	
	
	public static void main(String[] args) {
		 Course c = new Course();
		 c.setCid(1);
		 c.setCname("java");
		 
		 Course c1 = new Course();
		 c1.setCid(2);
		 c1.setCname("angular");
		 
		 Course c2 = new Course();
		 c2.setCid(3);
		 c2.setCname("html");
		 
		 Course c3 = new Course();
		 c3.setCid(4);
		 c3.setCname("python");

		 ArrayList<Course> l=new ArrayList<Course>();
		 l.add(c);
		 l.add(c1);
		 l.add(c2);
		 l.add(c3);
		 
		 
		 Student s = new Student();
		 s.setSid(100);
		 s.setSname("Ashwini");
		 s.setCourse(l);
		 
		   EntityTransaction entityTransaction=null;
		   EntityManager entityManager = null;
		   try {
		   EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		   entityManager=entityManagerFactory.createEntityManager();
		   entityTransaction =entityManager.getTransaction();
		   entityTransaction.begin();
		   
		   
		   
		   Course course = entityManager.find(Course.class, 4);
		   List<Student> stu =course.getStudent();
		   for(Student sss :stu) {
			   System.out.println(sss.getSid());
			   System.out.println(sss.getSname());
		   }
		   
		   
//		   entityManager.persist(s);
		   
		   System.out.println("record inserted to database");
		   entityTransaction.commit();
		   }catch(Exception e) {
			   e.printStackTrace();
			   entityTransaction.rollback();
			}
		   entityManager.close();
		   
	}
}
