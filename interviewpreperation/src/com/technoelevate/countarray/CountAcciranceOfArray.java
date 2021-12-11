package com.technoelevate.countarray;

public class CountAcciranceOfArray {
public static void main(String[] args) {
	int a[]= {10,5,13,40,1,5};
	int len=a.length;
	for(int i=0;i<len;i++) {
		int count=1;
		for(int j=i+1;j<len;j++) {
			if(a[i]==a[j]) {
				count++;
				for(int k=j;k<len-1;k++) {
					a[k]=a[j];
				}
				len--;
				j--;
			}

		}
		//System.out.println(a[i]+"--->"+count);
				if(count>=2) {
			System.out.println(a[i]+"-->"+count);
		}

	}
	
	
	}
}
