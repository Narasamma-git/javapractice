package com.testyantra.finalassessment;

public class CountOccuranceOfArray {

	public static void main(String[] args) {
		int a[]= {1,5,8,2,5,1,4,6};
		int n=a.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
					for(int k=j;k<n-1;k++) {
						a[k]=a[k+1];
					}
					n--;
					j--;
				}
				
			}
			System.out.println(a[i]+"-->times"+count);
		}
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]+);
//		}
		
		// TODO Auto-generated method stub

	}

}
