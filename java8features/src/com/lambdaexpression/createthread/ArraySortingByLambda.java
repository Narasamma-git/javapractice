package com.lambdaexpression.createthread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySortingByLambda {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList();
		list.add(500);
		list.add(100);
		list.add(300);
		list.add(50);
		list.add(1000);
		Collections.sort(list);
		
		for(Integer i:list){
			System.out.println(i);
		}
		
	}

}
