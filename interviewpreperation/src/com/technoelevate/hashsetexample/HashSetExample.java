package com.technoelevate.hashsetexample;

import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add("d");
hs.add("b");
hs.add("c");
hs.add("z");
hs.add("y");
hs.add("x");
hs.add("d");
Iterator<String> itr=hs.iterator();	
while(itr.hasNext()) {
System.out.println(itr.next());
	
}
	}

}
