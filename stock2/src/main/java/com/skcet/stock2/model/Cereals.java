package com.skcet.stock2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "_cereal")
public class Cereals {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String cname;
	private String cquantity;
	private double cprice;
	
	public Cereals() {
		super();
	}

	public Cereals(Long id, String cname, String cquantity, double cprice) {
		super();
		this.id = id;
		this.cname = cname;
		this.cquantity = cquantity;
		this.cprice = cprice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCquantity() {
		return cquantity;
	}

	public void setCquantity(String cquantity) {
		this.cquantity = cquantity;
	}

	public double getCprice() {
		return cprice;
	}

	public void setCprice(double cprice) {
		this.cprice = cprice;
	}
	
	
}