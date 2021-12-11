package com.testyantra.finalassessment;

public class CountOccuranceOfString {

	public static void main(String[] args) {
	String s="hi keerthi how are you";
	s.replace(" ","");
	System.out.println(s);
	char ch[]=s.toCharArray();
	int n=ch.length;
	for(int i=0;i<n;i++) {
		int count=1;

		for(int j=i+1;j<n;j++) {
			if(ch[i]==ch[j]) {
				count++;
				for(int k=j;k<n-1;k++) {
					ch[k]=ch[k+1];
				}
				j--;
				n--;
			
		}
		}
		
		System.out.println(ch[i]+"  ->"+count+"   times");
	}
	

	}

}
