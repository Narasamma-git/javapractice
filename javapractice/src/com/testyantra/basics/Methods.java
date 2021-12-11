package com.testyantra.basics;

public class Methods {
public int abc(int a) {
	 System.out.println("hello");
	 return a;
 }
 public static int abc(int a) {
	 System.out.println("hi");
	 return a;
 }
	public static void main(String[] args) {
		System.out.println(abc(20));
		// TODO Auto-generated method stub
Methods m=new Methods();
System.out.println(m.abc(10));

	}

}
