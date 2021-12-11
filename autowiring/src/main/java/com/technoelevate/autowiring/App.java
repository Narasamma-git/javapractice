package com.technoelevate.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.autow.Faculty;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/technoelevate/autowiring/autoconfig.xml");
    	Faculty f=(Faculty) context.getBean("faculty1");
      System.out.println( f );
    }
}
