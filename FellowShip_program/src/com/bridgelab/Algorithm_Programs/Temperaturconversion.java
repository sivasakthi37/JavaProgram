package com.bridgelab.Algorithm_Programs;
import java.util.Scanner;

import com.bridgelab.utility.Utility;
public class Temperaturconversion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1..for Celsius to Fahrenheit  ");
		System.out.println("Press 2..for Fahrenheit to Celsius ");
		int n=sc.nextInt();
		
		
		if(n==1) {
			Utility u=new Utility();
			Utility.TemperaturConversion t= u.new TemperaturConversion();
			t.CelsiustoFahrenheit();
			
		}else if(n==2) {
			
			Utility u=new Utility();
			Utility.TemperaturConversion t= u.new TemperaturConversion();
			t.FahrenheittoCelsius();
		}
		else {
			System.out.println("Plz Entred valid number");
		}
		
	}
	
	
	
}
