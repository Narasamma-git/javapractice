package com.lambdaexpression.createthread;

public class LambdaThread {

	public static void main(String[] args) {
		Runnable r=()->{
			System.out.println("overriding run method");
			
		};
		Thread t=new Thread(r);
		t.run();
		System.out.println(Thread.currentThread());
		
	}

}
