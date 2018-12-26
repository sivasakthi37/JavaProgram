package com.bridgelab.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {

// program of String username ..................	
public static void Stringname() {
		
		
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the string value");
		
		String st=sc.nextLine();
		
		System.out.println("Hello "+st+", How are you?");
				
	}
	

//coin program..........................
		
public static void CoinProgram() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the time how many time you flip the coin");
	int n=sc.nextInt();
	
	int tails=0,heads=0;
	for(int i=0;i<n;i++) {
		System.out.println("press anykey to flip the coin");
		sc.next();
	//random function
		Random rn=new Random();
	
		int r=rn.nextInt(2);// it generate 0 to 1
		System.out.println(r);
		if(r==0) {
			tails++;
		}
		else {
			heads++;
		}
	}
	int tail,head;
	
	 tail=(tails*100)/n;
	 head=(heads*100)/n;
	System.out.println("percentage of tail is "+tail);
	System.out.println("percentage of head is "+head);
		
	
}
//LeapYear Program............................

public static void LeapYear() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your year");
	int y=sc.nextInt();
	
	if(y%4==0 &&y%100!=0||y%400==0 ) //it is use to find your year is leapyear or not
	{
		System.out.println(y+" is a leap year");
	}
	else {
		System.out.println("it is not a leap year");
	}	
}
//Power of 2 program 

public static void Powerof2() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int n=sc.nextInt();
	
	
	for(int i=0;i<=n;i++) {
		int mul;
		mul=2*i;
		System.out.println("2 * "+i + "= "+mul);	
	}	
}
//	Harmonic number program

public static void Harmonic() {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+1/i;
	}
	System.out.println(sum);
	}

// facorial.....................................

public static void factorial() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to find tha factorice");
	int n=sc.nextInt();
	for(int i=2;i<n;i++) {
		
		while(n%i==0) {
	System.out.println(i);
	n=n/i;
		}
	}
	if(n<2) {
		System.out.println(n);
	}
}
//gambler  program............

public static void gamblers() {
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the goal ");
	int goal=sc.nextInt();//get the value from the user to raech the goal state
	Random rn=new Random();
	//int goal=10;
	int win=0;
	int loose=0;
	int toss=0;
	int amount=0;
	
	while(amount<goal) {	
		toss++;
		System.out.println("Enter your betting number 1 to 6");
		int b=sc.nextInt();
		
		System.out.println("press any key to toss ");
		sc.nextLine();
		int r=rn.nextInt(6)+1;
		System.out.println(r);
		if(b==r) {
			win++;
			amount=amount+r;
			System.out.println(amount);
			if(amount>goal) {
				amount=amount-r;
				System.out.println(amount);
			}
		}	
		else {
			loose++;
		}
	}
	
int pw=(win*100)/toss;
int pl=(loose*100/toss);
	
	
	System.out.println("win percentage out of toss is "+pw);
	System.out.println("loose percentage out of toss "+pl);
	
	// show  user to all the values 
	System.out.println("win==========>"+win);
	System.out.println("loose========>"+loose);
	System.out.println("amount========>"+amount);
	System.out.println("toss===========>"+toss);
}
//coupon function

public static void coupon() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Size of the array");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<a.length;i++) {
		
		
		
		
		Random rn=new Random();
		int r=rn.nextInt(9);
		a[i]=r;
		
	 for (int j=0;j<i;j++)
     {
         if (a[i] == a[j])
         {
             i--;
         }
     }
		
		
		
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
	
	
	
	
	
	
	
}










}
