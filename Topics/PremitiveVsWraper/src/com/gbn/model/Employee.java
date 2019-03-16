package com.gbn.model;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private String empName;
	private int empSal;
	private Integer version;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer empId) {
		this.empId = empId;
	}

	/** full constructor */
	public Employee(Integer empId, String empName, int empSal, Integer version) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.version = version;
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

	public int getEmpSal() {
		return this.empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}