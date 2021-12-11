package com.vinnovativelabs.vinnovativelabs;

import java.util.Scanner;

public class NonHappyNumber {
	public static  int isHappy(int n) {
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			rem=rem*rem;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	if(n!=0 || n<0) {
int sum=isHappy(n);
System.out.println(sum);
	}
	else {
		System.out.println("enter valid integer"); 
	}

}
}
