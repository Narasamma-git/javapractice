package com.testyantra.threadbylamda;

public class LambdaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread(()->{
	{
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
});
t.start();
for(int i=0;i<5;i++) {
	System.out.println(Thread.currentThread().getName());
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
		
		
	}

}
