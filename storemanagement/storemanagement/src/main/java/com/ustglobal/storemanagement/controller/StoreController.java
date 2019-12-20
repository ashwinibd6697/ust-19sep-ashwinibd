package com.ustglobal.storemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.storemanagement.dto.Cart;
import com.ustglobal.storemanagement.dto.Products;
import com.ustglobal.storemanagement.dto.StoreResponse;
import com.ustglobal.storemanagement.service.StoreService;
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
@RestController
public class StoreController {

	@Autowired
	private StoreService service;
	@PostMapping(path = "/add" ,consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StoreResponse addproducts(@RequestBody Products product) {
		StoreResponse response=new StoreResponse();
		if(service.addproducts(product)) {
		   response.setStatuecode(200);
		   response.setMessage("success");
		   response.setDescription("product added to db");
		   
		}else {
			response.setStatuecode(400);
			   response.setMessage("success");
			   response.setDescription("product not added to db");
		}
		
		return response;
	}
	
	
	@PostMapping(path = "/update" ,consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StoreResponse updateproducts(@RequestBody Products product) {
		StoreResponse response=new StoreResponse();
		if(service.updateProducts(product)) {
		   response.setStatuecode(200);
		   response.setMessage("success");
		   response.setDescription("product added to db");
		   
		}else {
			response.setStatuecode(400);
			   response.setMessage("success");
			   response.setDescription("product not added to db");
		}
		
		return response;
	}

	@GetMapping(path = "/get" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public StoreResponse get() {
		StoreResponse response=new StoreResponse();
		List<Products> p =service.getAllProduct();
		if(p!=null){
		   response.setStatuecode(200);
		   response.setMessage("success");
		   response.setDescription("product added to db");
		 response.setProducts(p);
		}else {
			response.setStatuecode(400);
			   response.setMessage("success");
			   response.setDescription("product not added to db");
		}
		
		return response;
	}
	
	
	
	@PostMapping(path = "/addcart/{quantity}" ,consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StoreResponse addCart(@RequestBody Products product,@PathVariable("quantity") int q) {
		
		System.out.println(product);
		StoreResponse response=new StoreResponse();
		   Cart t =service.addToCart(product,q);
		if(service.removeProduct(t.getId(), q)){
		   response.setStatuecode(200);
		   response.setMessage("success");
		   response.setDescription("product added to db");
		   
		}else {
			response.setStatuecode(400);
			   response.setMessage("success");
			   response.setDescription("product not added to db");
		}
		
		return response;
	}
	
	
	@GetMapping(path = "/getcart" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StoreResponse order() {
		StoreResponse response=new StoreResponse();
		    List<Cart> p =service.getCartProducts(); 
		if(p!=null){
		   response.setStatuecode(200);
		   response.setMessage("success");
		   response.setDescription("product added to db");
		   response.setCart(p);
		}else {
			response.setStatuecode(400);
			   response.setMessage("success");
			   response.setDescription("product not added to db");
		}
		
		return response;
	}
	
	
	@PostMapping(path = "/order" ,consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public StoreResponse order(@RequestBody List<Cart> product) {
		StoreResponse response=new StoreResponse();
		     
		if(service.order(product)){
		     for(Cart i : product) {
		    	 service.remove(i.getId());
		     }
		   response.setStatuecode(200);
		   response.setMessage("success");
		   response.setDescription("product added to db");
		  
		}else {
			response.setStatuecode(400);
			   response.setMessage("success");
			   response.setDescription("product not added to db");
		}
		
		return response;
	}
	
	
}
