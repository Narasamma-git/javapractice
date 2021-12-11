package com.technoelevate.lambdaexpression;

import com.technoelevate.lambdaexpression.MyFunctionalInterface;

public class LambdaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface mf=(a,b)->{
			int c=100;
			int d=200;
			int ff=a+b+c+d;

			return ff;
		};
		System.out.println(mf.display(10,20));
	}

}
