package com.vinnovativelabs.vinnovativelabs;

public class AddSubAdjucent {
	public static void main(String[] args) {
		int[] arr= {5,2,-9,3,4};
		int len=arr.length;
		int[] arr2=new int[len];
		
		for(int i=0;i<=len-1;i++) {
			if(i==0) {
				arr2[i]=arr[i]-arr[i+1];
			}
			else if(i==len-1) {
				arr2[i]=arr[i]+arr[i-1];
			}
			
		else { 
			
			arr2[i]=arr[i]+arr[i-1]-arr[i+1];
		
		}
			System.out.println(arr2[i]);
	
			}
	}

}
