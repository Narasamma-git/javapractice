package com.technoelevate.methodreferences;

import java.util.function.BiFunction;

public class ArithMain{
	
	public static void main(String[] args) {

	BiFunction<Integer, Integer>adder1 = Arithmetic::add;  
	BiFunction<Integer, Integer, Integer>adder2 = Arithmetic::add;  
    BiFunction<Float, Integer>adder3= Arithmetic::add;  

		
	}
	
}
