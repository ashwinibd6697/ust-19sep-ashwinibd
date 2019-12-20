package com.ustglobal.storemanagement.dto;

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
@Table(name="order_info")
public class Order {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private double totalprice;
	@Column

	private double total_price_with_gst;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public double getTotal_price_with_gst() {
		return total_price_with_gst;
	}

	public void setTotal_price_with_gst(double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}

	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="order_history_info", joinColumns=@JoinColumn(name="id"),
	            inverseJoinColumns = @JoinColumn(name="pid"))
	private List<Products> products;
	

}
