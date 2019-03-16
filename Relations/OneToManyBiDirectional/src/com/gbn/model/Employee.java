package com.gbn.model;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empId;
	private String empName;
	private Integer deptId;
	private Department dept;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
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
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}