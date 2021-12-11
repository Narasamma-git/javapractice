package com.technoelevate.hashsetexample;

import java.util.*;

public class CompareUsingCompareTo {

	public static void main(String[] args) {
		StudentComparator s=new StudentComparator();
		// TODO Auto-generated method stub
		Student s1=new Student(10,"Shourya");
		Student s2=new Student(20,"Keeerthi");		
		Student s3=new Student(30,"Bhavana");
		Student s4=new Student(40,"Vivek");
		
		TreeSet<Student> ts=new TreeSet(s);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
