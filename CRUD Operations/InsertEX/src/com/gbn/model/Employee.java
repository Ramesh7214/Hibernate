package com.gbn.model;

import java.math.BigDecimal;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private String empName;
	private BigDecimal empSal;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer empId) {
		this.empId = empId;
	}

	/** full constructor */
	public Employee(Integer empId, String empName, BigDecimal empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	// Property accessors

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getEmpSal() {
		return this.empSal;
	}

	public void setEmpSal(BigDecimal empSal) {
		this.empSal = empSal;
	}

}