package org.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotations.Profile;
import com.spring.annotations.Student;
import com.spring.annotations.TextEditor;

public class ManageAnnotations {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/spring/config/ApplicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("Student id::"+student.getSid());
		System.out.println("Student name:::"+student.getsName());
		
		TextEditor editor = (TextEditor) context.getBean("textEditor");
		editor.checkSpellings();
		
		Profile profile = (Profile) context.getBean("profile");
		profile.getStudentId();
		profile.getSudentName();

	}

}
