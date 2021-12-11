package com.technoelevate.finalmock;

public class Employee {
String name;
int age;
double salary;
public Employee(String name, int age, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}
@Override
public String toString() {
	return "name=" + name + ", age=" + age + ", salary=" + salary ;
}


}
