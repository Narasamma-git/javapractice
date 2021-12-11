package com.technoelevate.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.dependency.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
   ApplicationContext context=new ClassPathXmlApplicationContext("com/technoelevate/dependencyinjection/config.xml");
      Person p=(Person)context.getBean("person1");
    System.out.println(p);
    }
}
