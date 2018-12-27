package com.bridgelab.Algorithm_Programs;

import com.bridgelab.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int a[]=new int[] {1,2,3,4,5,6,7};
		
	int	n=Utility.binarysearch(a,2);
		if(n==1){
			System.out.println("your number is present");
		}
		else {
			System.out.println("your number is not present");
		}
		
	}
	
	
}
