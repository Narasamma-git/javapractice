package com.technoelevate.SpringCore.ReferenceTypeInjection;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/technoelevate/SpringCore/ReferenceTypeInjection/RefConfig.xml");
	Person ajay= (Person) context.getBean("person1");
	Person manju= (Person) context.getBean("person2");
	
	System.out.println(ajay);
	System.out.println(manju);
	
	}

}
