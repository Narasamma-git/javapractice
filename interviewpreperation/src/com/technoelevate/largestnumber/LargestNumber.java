package com.technoelevate.largestnumber;

public class LargestNumber {
	public static void main(String[] args) {
int a[]= {20,50,10,40,60};
int max=a[0];
int min=0;
for(int i=1;i<a.length;i++) {
	if(a[i]>max) {
		max=a[i];
	}
}
System.out.println(max);
	}
}
