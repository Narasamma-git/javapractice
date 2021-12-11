package com.testyantra.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocaldateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate ld=LocalDate.now();
System.out.println(ld);
LocalDate yesterday=ld.minusDays(1);
System.out.println("yesterday  "+yesterday);
LocalDate tommarow=yesterday.plusDays(2);
System.out.println("tommarrow  "+tommarow);


LocalDate date1=LocalDate.of(2019, 07, 07);

System.out.println(date1);
System.out.println(date1.isLeapYear());

LocalDateTime t=date1.atTime(3,16,00);
System.out.println(t);
	}

}
