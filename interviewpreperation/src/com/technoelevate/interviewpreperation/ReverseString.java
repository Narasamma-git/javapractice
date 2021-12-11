package com.technoelevate.interviewpreperation;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s;
		s=sc.nextLine();
		int len=s.length();
		char ch[]=new char[len];
		for(int i=s.length()-1;i>0;i--) {
for(int j=0;j<ch.length;j++) {
	ch[j]=s.charAt(i);
	
	}
}
		
		String newstring=new String(ch);
	
	System.out.println(newstring);
	
	}
}
