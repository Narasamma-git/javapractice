package com.technoelevate.finalmock;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) {
		Employee1 f1=new Employee1(10, "as", 20);
		Employee1 f2=new Employee1(20, "as", 20);
		Employee1 f3=new Employee1(30, "as", 20);
		
		ArrayList<Employee1 > a1=new ArrayList<Employee1>();
		ArrayList<Employee1 > a2=new ArrayList<Employee1>();
		ArrayList<Employee1 > a3=new ArrayList<Employee1>();
		
		a1.add(f1);
		a2.add(f2);
		a3.add(f3);
		List list=new ArrayList();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		System.out.println(list); 
			
		
	}

}
