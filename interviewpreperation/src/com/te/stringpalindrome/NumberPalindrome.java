package com.te.stringpalindrome;
import java.util.*;
public class NumberPalindrome {

	public static void main(String[] args) {
		int num=121;
		int rem=0;
		int sum=0;
	int temp=num;
		while(num!=0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
			
			
		}
	
		if(temp==sum) {
			System.out.println(temp+" is palindrome");
		}
		else
			System.out.println("not palindrome");
		

	}

}
