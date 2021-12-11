package com.testyantra.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



public class FilterByStream {

	public static void main(String[] args) {
	Product p1=new Product(1,"Apple",85000.00);
	Product p2=new Product(2,"Honor",6000.00);
	Product p3=new Product(3,"Techno",5000.00);
	Product p4=new Product(4,"Asus",8000.00);

	
	List<Product> list=new ArrayList<Product>();
	
	Stream<Product> stream=list.stream().filter(p->p.price>1000);
	
	stream.forEach((n)->{
		System.out.println(n.pid+"  "+n.pname+" "+n.price);
	});

	}

}
