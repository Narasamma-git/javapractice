package com.technoelevate.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.SpringCoreDemo.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/Autowiring/Autowiring.xml");

		/*
		 * Employee emp1= context.getBean("emp1",Employee.class);
		 * System.out.println(emp1);
		 */

		/*
		 * NewStudent student1 = context.getBean("student1", NewStudent.class);
		 * System.out.println(student1);
		 */
		
		/*
		 * StudentInfo sf1=context.getBean("studentInfo1",StudentInfo.class);
		 * System.out.println(sf1);
		 */

	}

}
