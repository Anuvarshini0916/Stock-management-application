package com.skcet.stock2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "_bev")
public class Beverages {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String bname;
	private String bquantity;
	private double bprice;
	public Beverages() {
		super();
	}
	
	public Beverages(Long id, String bname, String bquantity, double bprice) {
		super();
		this.id = id;
		this.bname = bname;
		this.bquantity = bquantity;
		this.bprice = bprice;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBquantity() {
		return bquantity;
	}
	public void setBquantity(String bquantity) {
		this.bquantity = bquantity;
	}
	public double getBprice() {
		return bprice;
	}
	public void setBprice(double bprice) {
		this.bprice = bprice;
	}
	


	

	
}