package com.technoelevate.arrays;

public class Arays {

	public static void main(String[] args) {
	int[] arr=new int[10];
	arr[0]=1;
	arr[1]='a';
	arr[2]=10;
	arr[3]=100;
	Object[] obj=new Object[10];
	obj[0]=new String("Narsu");
	obj[1]=new Integer(1000000000);
	obj[2]=new Float(10f);
	obj[3]=new Double(20d);
	obj[4]=new Character('a');
	for(int i=0;i<obj.length;i++) {
	System.out.println(obj[i]); 
	}
	
	
	
	}

}
