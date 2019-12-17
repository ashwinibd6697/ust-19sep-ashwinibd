package com.ustglobal.singleton;

public class MySingleton {
//  private static MySingleton instance=null;
	 private final static MySingleton instance=new MySingleton();
  
  
  String s;
  private MySingleton(){
	  
  }
		public static MySingleton getDbConnection() {
//			if(instance==null) {
//				instance = new MySingleton();
//				System.out.println("connection established");
//				return instance;
//			
//			}else {
//				System.out.println("connection already established");
//				 
//				return instance;
//			}
			return instance;
		}
}
