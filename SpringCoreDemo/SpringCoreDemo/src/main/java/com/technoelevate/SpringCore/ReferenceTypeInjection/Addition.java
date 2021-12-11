package com.technoelevate.SpringCore.ReferenceTypeInjection;

public class Addition {

	private int  a;
	private int  b;
	public Addition(int a, int b) {
	
		this.a = a;
		this.b = b;
		System.out.println("Setting the data with const injection. Datatype : int , int");
	}
	
	public Addition(double a, double b) {
		
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Setting the data with const injection. Datatype : double , double");
	}
	
	public void myAddMethod() {
		int output=this.a+this.b;
		System.out.println(output);
	}
	
	
}
