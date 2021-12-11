package com.testyantra.leapyear;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
				   			      int year;
			      System.out.println("Enter an Year :: ");
			      Scanner sc = new Scanner(System.in);
			      year = sc.nextInt();

			      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			         System.out.println("0");
			      else
			      {
			    	  
			    	    int n = 1;
			            // n is the no of leap years after year 2020
			            // that is needed to print
			     
			            int count = 0;
			            // Creating and initializing a variable
			            // to maintain count of leap years
			     
			            while (count != n)
			            // Conditionality check- Count variable should never
			            // equals number of leap years to be printed
			            {
			     
			                year = year + 1;
			                // Incrementing the year count by 1
			     
			                if ((year % 400 == 0)
			                    || (year % 4 == 0 && year % 100 != 0)) {
			     
			                    // If the year is leap year,then increment
			                    // the count
			                    count++;
			     
			                    // Print the leap year
			                    System.out.println(year);
			                }
			    	  
			    	  
			    	  
			      }
			   }
			

	}
	

}
