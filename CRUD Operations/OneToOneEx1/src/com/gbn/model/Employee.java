package com.gbn.model;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer employeeId;
	private Department department;
	private String employeeName;
	private Integer employeeSal;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/** full constructor */
	public Employee(Integer employeeId, Department department, String employeeName, Integer employeeSal) {
		this.employeeId = employeeId;
		this.department = department;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
	}

	// Property accessors

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeSal() {
		return this.employeeSal;
	}

	public void setEmployeeSal(Integer employeeSal) {
		this.employeeSal = employeeSal;
	}

}