package com.ustglobal.sbootrev.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.sbootrev.dto.Medicines;
import com.ustglobal.sbootrev.dto.Response;
import com.ustglobal.sbootrev.dto.Users;
import com.ustglobal.sbootrev.service.UsersService;

@RestController
public class MedicalStoreController {

	@Autowired
	private UsersService service;
	
	
	
	@PostMapping(path="/register",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public Response addUsers(@RequestBody Users users) {
    Response response = new Response();
		if(service.addUsers(users)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("data added to the db");
			 
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not added to the db");
		}
		return response;
	}
	
	
	
	@PostMapping(path="/l",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public Response login(@RequestBody Users users) {
    Response response = new Response();
		if(service.login(users)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("user login successfully");
			
			 
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription(" to the db");
		}
		return response;
	}
	
	
	
	@PostMapping(path="/addmed",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public Response addMedicine(@RequestBody Medicines medicine) {
    Response response = new Response();
		if(service.addMedicines(medicine)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("medicene added to the db");
			 
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("medicine not added to the db");
		}
		return response;
	}
	
	@GetMapping(path="/get/{name}",
			produces =MediaType.APPLICATION_JSON_VALUE)
	public Response addMedicine(@PathVariable ("name") String name) {
    Response response = new Response();
    Medicines m = service.getMedicines(name);
		if(m!=null) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("medicene  db");
			response.setMedicines(Arrays.asList(m));
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("medicine not added to the db");
		}
		return response;
	}
	
	
	
	@GetMapping(path="/getid/{mid}",
			produces =MediaType.APPLICATION_JSON_VALUE)
	public Response getMedicine(@PathVariable ("mid") int id) {
    Response response = new Response();
    Medicines m = service.getMedicinesById(id);
		if(m!=null) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("medicene  db");
			response.setMedicines(Arrays.asList(m));
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("medicine not added to the db");
		}
		return response;
	}
	
	
	
	@DeleteMapping(path="/deleteid/{mid}",
			produces =MediaType.APPLICATION_JSON_VALUE)
	public Response deleteMedicine(@PathVariable ("mid") int id) {
    Response response = new Response();
     
		if(service.deleteMedicineById(id)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("medicene  db");
		
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("medicine not added to the db");
		}
		return response;
	}
	
	
	@DeleteMapping(path="/deletename/{name}",
			produces =MediaType.APPLICATION_JSON_VALUE)
	public Response deleteMedicine(@PathVariable ("name") String name) {
    Response response = new Response();
     
		if(service.deleteMedicineByName(name)) {
			response.setStatusCode(200);
			response.setMessage("success");
			response.setDescription("medicene  db");
		
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("medicine not added to the db");
		}
		return response;
	}
}

