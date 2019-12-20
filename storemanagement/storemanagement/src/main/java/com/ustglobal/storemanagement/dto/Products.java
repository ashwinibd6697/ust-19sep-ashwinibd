package com.ustglobal.storemanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="product_info")
public class Products {
	@Id
	@GeneratedValue
	@Column
	private int pid;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private  String company;
	@Column	
	private int quantity;
	@Column
	private double price;
	public int getId() {
		return pid;
	}
	public void setId(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Exclude
	@ManyToMany( cascade=CascadeType.ALL,mappedBy = "products")

	private List<Order> order;

}
