package com.technoelevate.SpringDemo.ConstructorInjection;

public class SuperHeros {

	private String name;
	private String ability;
	
	public SuperHeros(String name, String ability) {
		super();
		this.name = name;
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "SuperHeros [name=" + name + ", ability=" + ability + "]";
	}
	
	
}
