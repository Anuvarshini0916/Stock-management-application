package com.skcet.stock2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "_fruits")
public class Fruits {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String fname;
	private String fquantity;
	private double fprice;
	
	public Fruits() {
		super();
	}

	public Fruits(Long id, String fname, String fquantity, double fprice) {
		super();
		this.id = id;
		this.fname = fname;
		this.fquantity = fquantity;
		this.fprice = fprice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFquantity() {
		return fquantity;
	}

	public void setFquantity(String fquantity) {
		this.fquantity = fquantity;
	}

	public double getFprice() {
		return fprice;
	}

	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	
	
}