package com.bridgelab.Algorithm_Programs;

import com.bridgelab.utility.Utility;
import java.util.Scanner;
public class Bubblesort {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
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
}
}
