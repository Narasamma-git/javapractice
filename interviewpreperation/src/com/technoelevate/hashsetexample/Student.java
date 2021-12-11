package com.technoelevate.hashsetexample;

public class Student {
int age;
String name;

public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
@Override
public String toString() {
	return ""+ age + ""+name;
}
}
