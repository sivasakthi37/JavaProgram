package com.bridgelab.Algorithm_Programs;
import java.time.Instant;
import java.util.Scanner;

import com.bridgelab.utility.Utility;
public class SortedAlgorithm {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("==================ENTER YOUR CHOISE===========");
	System.out.println("1..binarySearch method for integer\n" + 
			"2..binarySearch method for String\n" + 
			"3..insertionSort method for integer\n" + 
			"4..insertionSort method for String\n" + 
			"5..bubbleSort method for integer\n" + 
			"6..bubbleSort method for String\n" + 
			"");
	int n=sc.nextInt();
	switch(n) {
	
	case 1:{
		long Start=Instant.now().toEpochMilli();
		System.out.println("Enter the Size of the Array... ");
		
		int nu=sc.nextInt();
		
		
		int a[]=new int[nu];
		System.out.println("Enter the value of value ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("your Entered value is ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("ENter the Search Element");
		int search=sc.nextInt();
		
		
	int	r=Utility.binarysearch(a,search);
		
		 if(r==-1) {
			System.out.println("your number is not present");
		}
		else {
			System.out.println("your number is present in "+r+" index");
		}
		 long end=Instant.now().toEpochMilli();
		 double d=(end-Start)/1000;
		 System.out.println("This process time "+d+" seconds ");
		break;
	}
	
	case 2:
	{
		long Start=Instant.now().toEpochMilli();
		System.out.println("Enter the Size of array");
	           int num=sc.nextInt();
	           String a[]=new String[num];
	           
	           System.out.println("enter the value of array");
	           for(int i=0;i<a.length;i++) {
	        	   a[i]=sc.next();
	           }
		System.out.println("your Entered element is");
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]+" ");
		}
	     System.out.println(" Enter your number ");      
	           String st=sc.next();
	         
		int r=Utility.binarySearchstr(a, st);
		
		if(r==-1) {
			System.out.println("your String is not present");
		}
		else {
			System.out.println("your String is present in "+r+" String");
		}
		
		 long end=Instant.now().toEpochMilli();
		 double d=(end-Start)/1000;
		 System.out.println("This process  time "+d+" seconds ");
		 break;
	}
	
	case 3:
	{
		long Start=Instant.now().toEpochMilli();
		
		System.out.println("Enter the Size of Array ");
		int num=sc.nextInt();
		
		int a[]=new int[num];
		
		System.out.println("Enter the values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	System.out.println(" Your Enterd array value is ");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println("--------------------------------");
	System.out.println("Your sorted element is ");
	int b[]=Utility.insertionsort(a);
	for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
	}	
	long end=Instant.now().toEpochMilli();
	 double d=(end-Start)/1000;
	 System.out.println("This process time "+d+" seconds ");
	break;
		
	}
	case 4:{
		
		long Start=Instant.now().toEpochMilli();
		System.out.println("Enter the array size");
		int num=sc.nextInt();
		String a[]=new String[num];
		System.out.println("Enter the Strings");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.next();
		}
		System.out.println("Your Entered String is ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String b[]=Utility.insertionstr(a);
		System.out.println("-------------------------------------------------");
		System.out.println("Your entred Element is");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);	
		}	
		long end=Instant.now().toEpochMilli();
		 double d=(end-Start)/1000;
		 System.out.println("This process time "+d+" seconds ");
		break;
		
	}
	case 5:{
		long Start=Instant.now().toEpochMilli();
		
		System.out.println("Enter the Size of the Array ");
		int num=sc.nextInt();
		
		int a[]=new int[num];
		
		System.out.println("Enter the element in array");
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Your entered Array is ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int b[]=Utility.bubblesort(a);
		System.out.println("Your SortedArray is");
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}	
		
		long end=Instant.now().toEpochMilli();
		 double d=(end-Start)/1000;
		 System.out.println("This process time "+d+" seconds ");
		break;
		
	}
	case 6:{
		
		long Start=Instant.now().toEpochMilli();
		
		System.out.println("Enter the array size");
		int num=sc.nextInt();
		String a[]=new String[num];
		System.out.println("Enter the Strings");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.next();
		}
		System.out.println("Your Entered String is ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String b[]=Utility.insertionstr(a);
		System.out.println("-------------------------------------------------");
		System.out.println("Your entred Element is");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);	
		}
		long end=Instant.now().toEpochMilli();
		 double d=(end-Start)/1000;
		 System.out.println("This process time "+d+" seconds ");
		break;
	}
	
	
	
	}	
}	
}
