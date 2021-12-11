package com.technoelevate.mock;
import java.util.*;
public class ListTask{

public static void main(String[] args) {
	
List<String> list=new ArrayList();
list.add("name");
list.add("age");
list.add("salary");

List<String> list1=new ArrayList();
list1.add("A");
list1.add("23");
list1.add("15000");

List<String> list2=new ArrayList();
list2.add("B");
list2.add("24");
list2.add("25000");

List<String> list3=new ArrayList();
list3.add("C");
list3.add("25");
list3.add("35000");

ArrayList arrlist=new ArrayList();
arrlist.add(list1);
arrlist.add(list2);
arrlist.add(list3);

List l1=new ArrayList();
for(int i=0;i<arrlist.size();i++) {
	int c=0;
Map map=new HashMap();

for(int j=0;j<list.size();j++) {
	map.put(list.get(j),((ArrayList<String>)arrlist.get(i)).get(c));
	c++;

}
Set set=map.entrySet();
l1.add(new ArrayList(set));
							
	}
System.out.println(l1);
							
}
}