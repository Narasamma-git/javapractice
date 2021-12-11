package com.testyantra.occurance;

import java.util.Scanner;

public class CountOccuranceOfString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String string=sc.nextLine();
	char[] ch=string.toCharArray();

	for(int i=0;i<ch.length;i++) {
		int count=1;
		for(int j=i+1;j<ch.length;j++ ) {
			
			if(ch[i]==ch[j]) {
				count++;
			}
		}
		System.out.println(ch[i]+" "+count);
	}


	}

}
