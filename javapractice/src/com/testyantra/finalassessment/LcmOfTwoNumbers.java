package com.testyantra.finalassessment;

public class LcmOfTwoNumbers {
	public void lcm(int a,int b) {
		int i=1;
		while(i%a!=0 || i%b!=0) {
			i++;

		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		int n1=3;
		int n2=5;
		LcmOfTwoNumbers l=new LcmOfTwoNumbers();
	//	l.lcm(n1, n2);
		int i=1;

		while(true) {
			if(i%n1==0 && i%n2==0) {
				System.out.println(i);
				break;
			}
			else {
				i++;
			}
				
		}
	}

}
