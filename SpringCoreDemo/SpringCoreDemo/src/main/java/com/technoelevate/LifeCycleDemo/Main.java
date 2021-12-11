package com.technoelevate.LifeCycleDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	AbstractApplicationContext context =	new ClassPathXmlApplicationContext("com/technoelevate/LifeCycleDemo/LifeCycle.xml");
	context.registerShutdownHook();
//	Samosa triconaUphar= (Samosa)	context.getBean("s1");
//	System.out.println(triconaUphar);
	
//	Pepsi pepsi = (Pepsi) context.getBean("p1");
//	System.out.println(pepsi);
	
	Advance advance = (Advance) context.getBean("advance");
	System.out.println(advance);
	
	}

}
