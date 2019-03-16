package com.gbn.model;

import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer studentId;
	private String studentName;
	private Set<Course> courses;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** full constructor */
	public Student(String studentName, Set courses) {
		this.studentName = studentName;
		this.courses = courses;
	}

	// Property accessors

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}