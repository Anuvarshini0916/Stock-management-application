package com.skcet.stock2.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "_stock")
public class StockDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String productname;
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "fruit_id", referencedColumnName = "id")
	private List<Fruits> fruits;
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "cereals_id", referencedColumnName = "id")
	private List<Cereals> cereals;
	@OneToMany(cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "beverages_id", referencedColumnName = "id")
	private List<Beverages> beverages;
//	
	public StockDetails() {
		super();
	}

	public StockDetails(Long id, String productname) {
		super();
		this.id = id;
		this.productname = productname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public List<Fruits> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruits> fruits) {
		this.fruits = fruits;
	}

	public List<Cereals> getCereals() {
		return cereals;
	}

	public void setCereals(List<Cereals> cereals) {
		this.cereals = cereals;
	}

	public List<Beverages> getBeverages() {
		return beverages;
	}

	public void setBeverages(List<Beverages> beverages) {
		this.beverages = beverages;
	}
	
	

}