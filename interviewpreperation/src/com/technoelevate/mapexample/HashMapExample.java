package com.technoelevate.mapexample;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap();
		hm.put(null,"narasamma");
		hm.put("z","Avinash");
		hm.put("b","Aradhana");
		hm.put("d","Ravi");
		Set<String> s=hm.keySet();
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			String value=hm.get(key);
			System.out.println(key+" "+value);
		}

	}

}
