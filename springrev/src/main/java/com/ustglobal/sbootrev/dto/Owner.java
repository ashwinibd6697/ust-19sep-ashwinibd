package com.ustglobal.sbootrev.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="owner")
public class Owner {

	@Id
	@Column
	private int oid;
	
	@Column
	private String storename;
	@Column
	private String name;
	
	@Column
	private String email;

	@Column
	private String password;

	
	@Column
	private long mobileNo;
	
	
	
	public int getId() {
		return oid;
	}


	public void setId(int oid) {
		this.oid = oid;
	}


	public String getStorename() {
		return storename;
	}


	public void setStorename(String storename) {
		this.storename = storename;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
	

}
