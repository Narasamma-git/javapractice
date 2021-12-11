package com.testyantra.optionalclass;

import java.util.Optional;

public class OptionalForNullPointerException {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[5]="hi";
		Optional<String> opt=Optional.ofNullable(str[5]);
		if(opt.isPresent()) {
			String l=str[5].toLowerCase();
			System.out.println(str[5]);
		}
		else {
			System.out.println("value is not present");
		}

	}

}
