package com.gbn.model;

import java.math.BigDecimal;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private BigDecimal empId;
	private String empName;
	private BigDecimal empSal;
	private BigDecimal version;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(BigDecimal empId) {
		this.empId = empId;
	}

	/** full constructor */
	public Employee(BigDecimal empId, String empName, BigDecimal empSal, BigDecimal version) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.version = version;
	}

	// Property accessors

	public BigDecimal getEmpId() {
		return this.empId;
	}

	public void setEmpId(BigDecimal empId) {
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

	public BigDecimal getVersion() {
		return this.version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}