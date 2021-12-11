package com.testyantra.finalassessment;

public class PalindromeNumber {

	public static void main(String[] args) {
		int n=121;
		int rem=0;
		int sum=0;
		int temp=n;
		
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;	
		}
		if(temp==sum) {
			System.out.println("the given number is palindrome");
		}
		else {
			System.out.println("the given number is not palindrome");
		}
	}

}
