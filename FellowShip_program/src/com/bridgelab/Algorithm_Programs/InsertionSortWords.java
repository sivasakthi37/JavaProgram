package com.bridgelab.Algorithm_Programs;

import java.time.Instant;
import java.util.Scanner;
import com.bridgelab.utility.Utility;

public class InsertionSortWords {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
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
		
	}

}
