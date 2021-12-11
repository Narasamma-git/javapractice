package com.technoelevate.springdimain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.springdi.Man;

public class ManMain {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("/com/technoelevate/springdimain/manconfig.xml");
	Man man=(Man)context.getBean("man1");
	System.out.println(man);

	}

}
