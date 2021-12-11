package com.technoelevate.bubblesort;

public class SortingString {
	
	
	
	private static int asciiValue(String string) {
		int value=0;
		for(int i=0;i<string.length();i++) {
			value+=(int)string.charAt(i);
		}
	
		return value;
		 
	}
	
public static void main(String[] args) {

	//String s="My name is Narasamma";// My is name Narasamma
	String s="is name My Kr";//My is name Narasamma

	String[] str=s.split(" ");
for(int i=0;i<str.length;i++) {
		for(int j=i+1;j<str.length;j++) {
			if(asciiValue(str[i])> asciiValue(str[j])) {
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
			}
		
		}
	}

	for(String ss:str) {
		
		System.out.println(ss+" "); 
	} 
}	
	}

