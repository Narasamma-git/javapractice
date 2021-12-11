package com.technoelevate.StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/technoelevate/StereotypeAnnotation/StereoConfig.xml");
	
	StudentFamily sf = context.getBean("Spidy",StudentFamily.class);
	System.out.println(sf);

	}

}
