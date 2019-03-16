package com.gbn.model;

/**
 * Products entity. @author MyEclipse Persistence Tools
 */

public class Products implements java.io.Serializable {

	// Fields

	private Integer id;
	private String productName;
	private Integer price;

	// Constructors

	/** default constructor */
	public Products() {
	}

	/** minimal constructor */
	public Products(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Products(Integer id, Integer price) {
		this.id = id;
		this.price = price;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID : "+id+", name : "+productName+" ,price : "+price;
	}

}