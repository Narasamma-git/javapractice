package com.lambdaexpression.createthread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionForSorting {

	public static void main(String[] args) {
	Product p1=new Product("Hp",50000,"red");
	Product p2=new Product("Dell",40000,"black");
	Product p3=new Product("Asus",40000,"grey");

	List<Product> list=new ArrayList();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	
	Collections.sort(list,(pp1,pp2)->{
		return pp1.name.compareTo(pp2.name);
		
	});
	
	list.forEach((n)->{
		System.out.println(n.name);
		
	});
	
	}

}
