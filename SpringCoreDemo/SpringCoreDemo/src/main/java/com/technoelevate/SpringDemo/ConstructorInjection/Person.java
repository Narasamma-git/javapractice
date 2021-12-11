package com.technoelevate.SpringDemo.ConstructorInjection;

public class Person {
	private String name;
	private int age;
	private SuperHeros heros;
	
		public Person(String name, int age, SuperHeros heros) {
		super();
		this.name = name;
		this.age = age;
		this.heros = heros;
	}
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", heros=" + heros + "]";
		}

}
