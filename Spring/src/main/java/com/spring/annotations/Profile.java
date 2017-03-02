package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("student3")
	Student student;
	
	public void getStudentId(){
		System.out.println("Student ID::"+student.getSid());
	}
	
	public void getSudentName(){
		System.out.println("Student Name::"+student.getsName());
	}

}
