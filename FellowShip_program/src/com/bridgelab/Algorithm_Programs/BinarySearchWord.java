package com.bridgelab.Algorithm_Programs;

import com.bridgelab.utility.Utility;
import java.util.Scanner;
public class BinarySearchWord {

public static void main(String[] args) {
	
	
	
	Scanner sc=new Scanner(System.in);	
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
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
