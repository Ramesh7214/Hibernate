package com.gbn.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gbn.model.Course;
import com.gbn.model.Student;

public class Test {

	public static void main(String[] args) {
		
		Configuration config =  new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		
		
		// insert
		Session session = factory.openSession();
		
		System.out.println("About to Insert Record !!");
		
		Student student = new Student();
		student.setStudentName("Vinodh");
		
		
		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("JAVA");
		
		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("Php");
		
		Set<Course> courseSet = new HashSet<Course>();
		courseSet.add(course1);
		courseSet.add(course2);
		
		student.setCourses(courseSet);
		
		session.beginTransaction();
		session.save(student);
		session.beginTransaction().commit();
		
		
		System.out.println("========END=========");
		
		session.close();
		factory.close();
		
		// found more update statements in the console. because of cascade="all"
	
	}

}
