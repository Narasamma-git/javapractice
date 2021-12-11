package com.testyantra.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FirstHashMap {

	public static void main(String[] args) {
		HashMap< Integer, String> hm=new HashMap<Integer,String>();
hm.put(1,"Nayana");
hm.put(2,"geetha");
hm.put(3,"Bharathi");
hm.put(4,"Akhila");
Set<Integer> s=hm.keySet();
Iterator<Integer> itr=s.iterator();
while(itr.hasNext()) {
	int key=itr.next();
	String value=hm.get(key);
	System.out.println(key+"  "+value);
}
	}

}
