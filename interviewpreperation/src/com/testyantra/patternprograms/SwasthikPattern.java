package com.testyantra.patternprograms;

import java.util.Scanner;

public class SwasthikPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i<row/2) {
					if(j<col/2) {
						if(j==0) {
						System.out.println("*");
						}
						else {
							System.out.println(" ");
						}
					}
				}
				else if(j==col/2){
					System.out.println("*");
				}
				else {
					if(i==0) {
						System.out.println("*");
					}
				 0+  }
				else if(i==row/2) {
				
				}
				
				
				
			}
			System.out.println("\n");
		}
	}

}
