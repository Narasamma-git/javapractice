package com.technoelevate.SpringDemo.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/SpringDemo/ConstructorInjection/ConstConfig.xml");
		/*
		 * Person John = (Person)context.getBean("JonSnow"); System.out.println(John);
		 */
		
		Addition addition = (Addition)context.getBean("add");
		addition.myAddMethod();
		
	}

}
