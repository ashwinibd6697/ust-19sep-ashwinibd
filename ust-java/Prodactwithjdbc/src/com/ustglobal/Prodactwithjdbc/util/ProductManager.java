package com.ustglobal.Prodactwithjdbc.util;

import com.ustglobal.Prodactwithjdbc.dao.ProductDAO;
import com.ustglobal.Prodactwithjdbc.dao.ProductDAOWithImpl;

public class ProductManager {
 private ProductManager() {
	 
 }
 public  static ProductDAO getInstance() {
	 return new ProductDAOWithImpl();
 }
}
