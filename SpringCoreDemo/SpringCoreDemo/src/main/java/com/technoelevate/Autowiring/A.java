package com.technoelevate.Autowiring;

public class A {
private B b;

public A(B b) {
	super();
	this.b = b;
	System.out.println("using const");
}

public A() {
	super();
	// TODO Auto-generated constructor stub
}

}
