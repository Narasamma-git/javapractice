package com.testyantra.lalithinfrasoft;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		try {
			emp.readData();
			//System.out.println(emp);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
