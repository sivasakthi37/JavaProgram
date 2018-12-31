package com.bridgelab.Algorithm_Programs;
import java.util.Scanner;

import com.bridgelab.utility.Utility;

public class Vending_machine {
public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Amount ");
	
	int am=sc.nextInt();
	
	Utility.vendingMachine(am);
	
	
}
}
