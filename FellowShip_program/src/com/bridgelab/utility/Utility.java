package com.bridgelab.utility;

import java.util.Random;
import java.util.Scanner;
import java.time.Instant;

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
//gambler  program............-----------------------------------------

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
//coupon function---------------------------------------------------------------------------------

public static void coupon() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Size of the array");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	
	for(int i=0;i<a.length;i++) {
		
		Random rn=new Random();
		int r=rn.nextInt(9);//it generate the random number
		a[i]=r;
		
	 for (int j=0;j<i;j++)
     {
         if (a[i] == a[j])//if the jvm generate number is already present. i value is getting decreased
         {
             i--;
         }
     }			
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
}
	// 2d Array------------------------------------------------------------------------------------

public static void TwodArray() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row number ");
	int r=sc.nextInt();
	System.out.println("enter the column number");
	int c=sc.nextInt();
	
	
	int a[][]=new int[r][c];
	System.out.println("Enter the value ");
	

	//it is get the array value from the user..............
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=sc.nextInt();	
		}
	}
	//print the array value....... 
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(" "+ a[i][j]);
		}
		System.out.println();	
	}		
}
//triplets----------------------------------------------------------------------------------------
public static void Tripletes() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of the array ");
	int n=sc.nextInt();
	
	//get one array from the user.........
    int a[]=new int[n];
    System.out.println("Enter the value ");
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    
    // main logic of triplets.....  
    for(int i=0;i<a.length-2;i++) {
    	for(int j=0;j<a.length-1;j++) {
    		for(int k=0;k<a.length;k++) {
    			if(a[i]+a[j]+a[k]==0) {
    				System.out.println("your triplets number is "+a[i]+" "+a[j]+" "+a[k]);
    				
    			}
    			
    			
    		}
    		
    	}
    	
    }	
	
}
//Distance program-------------------------------------------------------------------------

public static void Distancep() {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the  X value");
	int x=sc.nextInt();
	System.out.println("Enter the Y value ");
	int y=sc.nextInt();
	
	
	
	double d=((x*x)+(y*y));//to find the d value 
	System.out.println(d);	
	System.out.println("your square root value is "+Math.sqrt(d));// math.sqrt is use to find the square value......
	
	
}
//permutation--------------------------------------------------------------------------------------

	
   
	public class Permutation
	{
	    
	    public void permute(String str, int s, int e)
	    {
	        if (s == e)
	            System.out.println(str);
	        else
	        {
	            for (int i = s; i <= s; i++)
	            {
	                str = swap(str,1,i);
	                permute(str, s+1, e);// recursive call to generate all the possible values 
	                str = swap(str,1,i);
	            }
	        }
	    }

// swaping the two alphabets
	    public String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }

	}

   //stop watch-------------------------------------------------------------------------- 

	public static void Stopwatch() {
		
		Scanner sc=new Scanner(System.in);
		
		long Start=0,end=0;
		
		boolean flag=false;
		
		while(true) {
			
			System.out.println("Enter 0 for start the watch or Enter 1 for stop the watch" );
			Byte b=sc.nextByte();
			
			
			if(b==0) {
				Start=Instant.now().toEpochMilli();// get the miliseconds from the System 
			
				flag=true;
			}else if(b==1 && flag) {
				
				end=Instant.now().toEpochMilli();//Ended
				break;
				
			}
		}
		System.out.println((end-Start)/1000+" seconds ");
	}
//Quadratic formula program----------------------------------------------
public static void Quadratics() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of A");
	int a=sc.nextInt();
	System.out.println("Enter the value of B");
	int b=sc.nextInt();
	System.out.println("Enter the Value of C");
	int c=sc.nextInt();
	
	
	double delta=(b*b)-(4*a*c);
	// farmula for Quadratics....... 
	double x1=(-b+Math.sqrt(delta))/(2*a);
	double x2=(-b-Math.sqrt(delta))/(2*a);
	System.out.println("your Quadratic formula for positive sign is "+x1);
	
	System.out.println("your Quadratic formula for negative sign is "+x2);
	
}
//Wind chill-----------------------------------------------------------------
public static void Windchill() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Tempertate in Fahrenheit ");
	int t=sc.nextInt();
	System.out.println("Enter the  miles per hour ");
	int v=sc.nextInt();
	
double W=35.74+(0.6215*t)+((0.4275*t)-35.75)*(Math.pow(v, 0.16));// Formula to find the wind miles
	
	System.out.println(W);		
}
/*
  ***********************************Algorithm Programs is started***********************************


*/
// Anagram--------------------------------------------------------------------

public class Anagram {
	
	
public void ana() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1ST words TO FIND");
	String st1=sc.nextLine();//get first String from the user....
	System.out.println("Enter 2ND words TO FIND ");
	String st2=sc.nextLine();//get Second String from the user...
	
	boolean b=isanagram(st1,st2);
	if(b) {
		System.out.println("yes it is Anagram");
	}
	else {
		System.out.println("it is not a anagram");
	}
	
}

private boolean isanagram(String st1,String st2) {
	
	int c1[]=count(st1);
	int c2[]=count(st2);
	
	for(int i=0;i<c1.length;i++) {
		
	if(c1[i]!=c2[i]) {
		return false;
	       
	}	
	}
	return true;
}

private int[] count(String st1) {
	int count[]=new int[26];
	
	for(int i=0;i<st1.length();i++) {
		char ch=st1.charAt(i);
		if('a'<=ch && ch<='z') {
			count[ch-97]++;
		}
		else if('A'<=ch && ch<='Z') {
			count[ch-65]++;
		}	
	}
	return count;
}	
}
//1-1000 Prime numbers---------------------------------------------------------------------
public class prime {
	public void Prime() {
		for(int i=0;i<1000;i++) {
			
			if(isprime(i)) {
				System.out.println(i);	
			}	
		}	
	}
	private boolean isprime(int n) {
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {         //logic of prime number
				return false;
			}
		}
		return true;
	}	
}
// prime numbers that are Anagram and Palindrome-------------------------------------------- 


public class primeanapoli {
	public void Prime() {
		for(int i=0;i<1000;i++) {
			
			if(isprime(i)) {
				//System.out.println(i);
				
				ispalindrome(i);
				
				
				
			
			}	
		}	
	}
	private boolean isprime(int n) {
		
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {         //logic of prime number
				return false;
			}
		}
		return true;
	}	
	
	private void ispalindrome(int n) {
		int t=n;
		int r,rev=0;
		while(n!=0) {
			
			r=n%10;
			
		rev=rev*10+r;
			
			n=n/10;
		}
		
		if(rev==t) {
			System.out.print(" "+t);
		}
	}
}
//binary search in integer-------------------------------------------------------------------------------
public static int binarysearch(int a[],int ele) {
	int l=0;
	int h=a.length-1,m;
	while(l<=h) {
		m=(l+h)/2;
		if(ele==a[m]) {
			return m;
		}
		else if(ele<a[m]) {
			h=m-1;
		}
		else if(ele>a[m]) {
			l=m+1;
		}
		else {
			return m;
		}
	}
		return -1;
	
}
//binary search in String--------------------------------------------------------------------------------
public static int binarySearchstr(String st[],String str ) {
	
	int low=0;
	int high=str.length();
	
	
	while(low<=high) {
		int middle=(low+high)/2;
		
		if(st[middle].compareTo(str)==0) {
			return middle;
		}
		else if(st[middle].compareTo(str)<0) {
			
			low=middle+1;		
		}
		else if(st[middle].compareTo(str)>0) {
			high=middle-1;
		}
	}
	return -1;	
}
//isertion sort------------------------------------------------------------------------------------
public static int[] insertionsort(int a[]) {

	int temp;
	int j;
	
	for(int i=1;i<a.length;i++) {
		temp=a[i];
		j=i;
		while(j>0 && a[j-1]>temp) {
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
	}
	return a;	
}
//insertion Sort for String-----------------------------------------------------------------------------
public static String[] insertionstr(String a[]) {
	
	String temp;
	int j;
	for(int i=1;i<a.length;i++) {
		temp=a[i];
		j=i;
		while(j>0 && a[j-1].compareTo(temp)>0) {
		String s1=a[j-1];
		a[j-1]=a[j];
		a[j]=s1;
		j=j-1;
		}
		a[j]=temp;
		
	}
	
	return a;
	
}
//bubble sort-----------------------------------------------------------------------------------------
public static int[] bubblesort(int a[]) {
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
		}
	}
		return a;		
}
//bubble sort-----------------------------------------------------------------------------------------
public static String[] bubblestr(String a[]) {
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i].compareTo(a[j]) > 0) {
				String t=a[i];
				a[i]=a[j];
				a[j]=t;
			}	
		}
	}
	return a;
	
	
	
}


}
