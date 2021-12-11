package com.lambdaexpression.createthread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterUsingStreamApi {

	public static void main(String[] args) {
Product p1=new Product("Hp",5000,"blue");
Product p2=new Product("Dell",15000,"black");
Product p3=new Product("Asus",5000,"gray");
Product p4=new Product("",5000,"blue");
List<Product> list=new ArrayList();
list.add(p1);
list.add(p2);
list.add(p3);
list.add(p4);

Stream<Product> stream=list.stream().filter(p->p.price>10000);


stream.forEach((n)->{
	System.out.println(n.price+" "+n.name+" "+n.color);
});
	}

}
