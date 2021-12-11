package com.technoelevate.finalmock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {
public static void main(String[] args) {
	
	List<String> list1=new ArrayList();
	list1.add("name");
	list1.add("age");
	list1.add("salary");
	
	List<String> list2=new ArrayList();
	list2.add("A");
	list2.add("23");
	list2.add("20000");
	
	List<String> list3=new ArrayList();
	list3.add("B");
	list3.add("24");
	list3.add("15000");
	
	Map<String,String> map1=new HashMap();
	map1.put(list1.get(0),list2.get(0));
	map1.put(list1.get(1),list2.get(1));
	map1.put(list1.get(2),list2.get(2));
	
	Map<String,String> map2=new HashMap();
	map2.put(list1.get(0),list3.get(0));
	map2.put(list1.get(1),list3.get(1));
	map2.put(list1.get(2),list3.get(2));


Set<Map.Entry<String,String>> s1=map1.entrySet();
Set<Map.Entry<String,String>> s2=map2.entrySet();

List list4=new ArrayList();
list4.add(s1);
list4.add(s2);
	System.out.println(list4);
	
}
}
