package com.bridgelab.Algorithm_Programs;

import com.bridgelab.utility.Utility;

public class Mergesort {

	public static void main(String args[]) 
	{ 
	    int arr[] = {12, 11, 13, 5, 6, 7}; 

	    System.out.println("Given Array"); 
	    Utility.printArray(arr); 

	   // MergeSort ob = new MergeSort(); 
	    Utility.sort(arr, 0, arr.length-1); 

	    System.out.println("\nSorted array"); 
	    Utility.printArray(arr); 
	} 
	
	
	
}
