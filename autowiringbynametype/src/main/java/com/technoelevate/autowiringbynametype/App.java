package com.technoelevate.autowiringbynametype;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.autowiringbyname.Address;
import com.technoelevate.autowiringbyname.Faculty;
import com.technoelevate.autowiringbyname.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/technoelevate/autowiringbyname/bynameconfigxml.xml");
    	Faculty f=(Faculty)context.getBean("faculty1");
   
    	System.out.println("Faculty id:  "+f.getFid()+"  Faculty Name:  "+f.getFname());
    	List<Student> st=(List<Student>)f.getStudent();
    	Iterator<Student> itr=st.iterator();
    	while(itr.hasNext()) {
    		Student student=itr.next();
    		List<Address> address=(List<Address>)student.getAddress();
    		Iterator<Address> ad=address.iterator();
    		System.out.println("Student details:  "+student.getRegno()+" "+student.getName()+" "+student.getMob()+" "+student.getCollage());
    		while(ad.hasNext()) {
    			Address address1=ad.next();
       System.out.println(address1);

    		}
    		  System.out.println("\n");
    	}
    	
  
    }
}
