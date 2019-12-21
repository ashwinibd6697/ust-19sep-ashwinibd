package com.ustglobal.sbootrev.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class Users {
	
	@Id
	@Column 
	@GeneratedValue
	private int id;
	@Column
	private String name;
	
	@Column
	private String email;

	@Column
	private String password;
	
	@Column
	private long mobileNo;
	
	
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
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_med",joinColumns=@JoinColumn(name="id"),
	            inverseJoinColumns = @JoinColumn(name="mid"))
	private List<Medicines> m;


}
