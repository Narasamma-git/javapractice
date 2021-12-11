package com.technoelevate.duplicatecharacters;

import java.util.Scanner;
public class DuplicateCharacters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.nextLine();
	int len=s.length();
	char ch[]=s.toCharArray();
	for(int i=0;i<len;i++) {
		int count=1;
		for(int j=i+1;j<len;j++) {
			if(ch[i]==ch[j]) {
				count++;
				for(int k=j;k<len-1;k++) {
					ch[k]=ch[k+1];
				}
				len--;
				j--;
			}
		}

		if(count>=2) {
			System.out.println(ch[i]+"--->"+count);
		}	
	}	
}
}