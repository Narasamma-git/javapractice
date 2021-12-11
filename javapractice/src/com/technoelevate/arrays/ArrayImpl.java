package com.technoelevate.arrays;
public class ArrayImpl implements ArrayInterface {
	int a;
	public ArrayImpl(int a){
		this.a=a;
	}
	
	

@Override
	public String toString() {
		return " [a=" + a + "]";
	}



public static void main(String[] args) {
	ArrayInterface[] ai=new ArrayInterface[5];
	ai[0]=new ArrayImpl(10);
	ai[1]=new ArrayImpl(20);
	ai[2]=new ArrayImpl(30);
	ai[3]=new ArrayImpl(40);
	ArrayImpl aa=new ArrayImpl(10);
	for(int i=0;i<ai.length;i++) {
		System.out.println(ai[i]);
	}
	System.out.println(aa.a);
}
}
