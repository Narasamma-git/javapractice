package com.technoelevate.SpringDemo.ConstructorInjection;


	public class Addition {

		private int  a;
		private int  b;

		public Addition(double a, double b) {
			this.a = (int) a;
			this.b = (int) b;
			System.out.println("Setting the data with const injection. Datatype : double , double");
		}
		
		public Addition(int a, int b) {
			this.a = a;
			this.b = b;
			System.out.println("Setting the data with const injection. Datatype : int , int");
		}
		
		
		public Addition(String a, String b) {
			this.a = Integer.parseInt(a);
			this.b = Integer.parseInt(b);
			System.out.println("Setting the data with const injection. Datatype : String , String");
		}
		

		
		public void myAddMethod() {
			System.out.println(" Value of a : "+this.a);
			System.out.println(" Value of b : "+this.b);
			int output=this.a+this.b;
			System.out.println(output);
		}
		
		
	}

