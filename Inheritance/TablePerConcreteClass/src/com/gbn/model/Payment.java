package com.gbn.model;

/**
 * Payment entity. @author MyEclipse Persistence Tools
 */

public class Payment implements java.io.Serializable {

	// Fields

	private Integer PId;
	private Integer amount;

	// Constructors

	/** default constructor */
	public Payment() {
	}

	/** minimal constructor */
	public Payment(Integer PId) {
		this.PId = PId;
	}

	/** full constructor */
	public Payment(Integer PId, Integer amount) {
		this.PId = PId;
		this.amount = amount;
	}

	// Property accessors

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}