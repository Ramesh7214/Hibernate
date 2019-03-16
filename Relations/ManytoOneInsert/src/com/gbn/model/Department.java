package com.gbn.model;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer deptId;
	private String deptName;

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(Integer deptId,String deptName) {
		this.deptId=deptId;
		this.deptName = deptName;
	}

	// Property accessors

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}