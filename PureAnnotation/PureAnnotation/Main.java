package com.technoelevate.PureAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.ComponentTest.Employee;
import com.technoelevate.ComponentTest.SomeTest;



public class Main {

	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(JavaConfig.class);
		
		  Student student = context.getBean("getStudent",Student.class); 
		  student.study();
		  student.getMyAddress().myAddress();
		  student.getMyAddress().setStreet("BDA Street");
		  System.out.println(student.getMyAddress().getStreet());

		 
	}

}
