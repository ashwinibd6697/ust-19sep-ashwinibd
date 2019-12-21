package com.ustglobal.sbootrev.dto;

import java.util.List;



public class Response {
    
	private int statusCode;
    private String message;
	private String description;
	private List<Users> users ;
	private List<Owner> owner;
	private List<Medicines> medicines;
    
    
	public List<Owner> getOwner() {
		return owner;
	}
	public void setOwner(List<Owner> owner) {
		this.owner = owner;
	}
	public List<Medicines> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<Medicines> medicines) {
		this.medicines = medicines;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	
	
}
