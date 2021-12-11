package com.testyantra.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Product p1=new Product(1,"Asus",8000.00);
Product p2=new Product(2,"Dell",853697.00);
Product p3=new Product(3,"Hp",54789.00);
List<Product> list=new ArrayList<Product>();
list.add(p1);
list.add(p2);
list.add(p3);

Collections.sort(list,(pp1,pp2)->{
return pp1.pname.compareTo(pp2.pname);
});

list.forEach(n->{
System.out.println(n.pname);
});



}
}