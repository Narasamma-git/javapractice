package com.technoelevate.internalproject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.internalproject.list.InternalProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext  context=new ClassPathXmlApplicationContext("/com/technoelevate/internalproject/list/autoconfig.xml");
    	InternalProject ip=(InternalProject) context.getBean("internal1");
      System.out.println( ip );
    }
}
