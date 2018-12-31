package com.bridgelab.Algorithm_Programs;

import com.bridgelab.utility.Utility;
import java.util.Scanner;
public class Calander_day {

	
	 public static void main(String[] args){ 
		 Scanner sc=new Scanner(System.in);
	        String[] dayofweek = { "Invalid", "Sunday", "Monday", "Tuesday", 
	                                "Wednesday", "Thursday", "Friday", "Saterday" }; 
	        int y , m, d;
	        
	        System.out.println("Enter the day ");
	        d=sc.nextInt();
	        
	        System.out.println("Enter the month  ");
	        m=sc.nextInt();
	        
	        System.out.println("Enter the year  ");
	        y=sc.nextInt();
	        
	        System.out.println(" your day is "+dayofweek[Utility.method(y, m, d)]); 
	    } 
	
}
