package com.bridgelab.functional_programming;

import com.bridgelab.utility.Utility;
import com.bridgelab.utility.Utility.Permutation;
import java.util.Scanner;
public class Permutations {

	public static void main(String[] args)
    {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
        String str =sc.nextLine();
        int n = str.length();
        Utility u=new Utility();
        Utility.Permutation per=u.new Permutation();
        
        //Utility.permutation = new Permutation();
        per.permute(str, 0, n-1);
    }

	
	
}
