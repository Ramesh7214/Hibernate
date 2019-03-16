package com.gbn.model;

import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Integer courseId;
	private String courseName;
	private Set<Student> students;

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(String courseName, Set students) {
		this.courseName = courseName;
		this.students = students;
	}

	// Property accessors

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}