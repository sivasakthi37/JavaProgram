package com.bridgelab.Data_structures;
import java.util.Scanner;
public class Palindromechecker {

	
	public static void main(String[] args) throws Exception {
		
//		Mydequeue mydeque=new Mydequeue(6);
//		mydeque.addrear("malai");
//		
//		System.out.println(mydeque);
//		
//		mydeque.addfront("malli");
//		System.out.println(mydeque);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to find palindrome or not");
		String st=sc.next();
		char ch[]=st.toCharArray();
		char check[]=new char[ch.length];
		char check1[]=new char[ch.length];
		Mydequeue mydeque=new Mydequeue(ch.length+ch.length);

		for(int i=0;i<ch.length;i++) {
		
mydeque.addrear(ch[i]);
		}
		for(int i=ch.length-1;i>=0;i--) {
mydeque.addfront(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
			check[i]=(char) mydeque.removerear();
		}

		for(int i=0;i<ch.length;i++) {
			check[i]=(char) mydeque.removefront();
		}
	boolean 	b=palindrome(check,check1);
	if(b) {
		System.out.println("your String is palindrome");
	}
	else {
		System.out.println("your String is not palindrome");
	}

		}

	private static boolean palindrome(char[] check, char[] check1) {
		
		int f=1;
		for(int i=0;i<check.length;i++) {
			
			if(check[i]!=check[i]) {
				f=0;
				return false;
			}
			
			
		}
	
		return f==1;
	}
	}