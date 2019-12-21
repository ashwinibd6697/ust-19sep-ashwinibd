package com.ustglobal.sbootrev.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="medicines")
public class Medicines {

	
	
	@Id
	@Column
	private int mid;
	

	@Column
	private String name;
	
	@Column
	private int quantity;
	
	@Column
	private int price;
	
	public int getId() {
		return mid;
	}

	public void setId(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="oid")
	private Owner p;
	
	
	
}
