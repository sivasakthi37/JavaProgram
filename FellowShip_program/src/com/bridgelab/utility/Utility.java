package com.bridgelab.utility;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
// Merge sort-----------------------------------------------------------------------------------
static void merge(int arr[], int l, int m, int r) 
{ 
    // Find sizes of two subarrays to be merged........ 
    int n1 = m - l + 1; 
    int n2 = r - m; 

    // Create temp arrays...........
    int L[] = new int [n1]; 
    int R[] = new int [n2]; 

    /*Copy data to temp arrays*/
    for (int i=0; i<n1; ++i) 
        L[i] = arr[l + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = arr[m + 1+ j]; 


    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays... 
    int i = 0, j = 0; 

    // Initial index of merged subarry array ....
    int k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

    /* Copy remaining elements of L[] if any.... */
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 

    /* Copy remaining elements of R[] if any.. */
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 

// Main function that sorts arr[l..r] using 
// merge() 
public static void sort(int arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        // Find the middle point...... 
        int m = (l+r)/2; 

        // Sort first and second halves... 
        sort(arr, l, m); 
        sort(arr , m+1, r); 

        // Merge the sorted halves...... 
        merge(arr, l, m, r); 
    } 
} 

/* A utility function to print array of size n */
public static void printArray(int arr[]) 
{ 
    int n = arr.length; 
    for (int i=0; i<n; ++i) 
        System.out.print(arr[i] + " "); 
    System.out.println(); 
} 
//vending machine-----------------------------------------------

public static void vendingMachine(int am) {
	
	int notes[]=new int[]{1000,500,200,100,50,20,10,5,2,1};
	int count=0;
	for(int i=0;i<notes.length;i++) {
		
		if(am/notes[i]>0) {
		
			System.out.println("number of "+notes[i]+" is "+am/notes[i]);
			
			count =count+am/notes[i];
		am=am%notes[i];	
		}
	}
	System.out.println("your total number of notes is "+count);
}
//	 Gregorian calendar--------------------------------------------------
	public static int method(int year, int month, int day) 
    { 
        // to check the validity of day of month 
        int[] darr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 
  
        // check validity of year and month 
        if (year > 0 && (month > 0 && month <= 12)) { 
  
            // check for a leap year and month of February 
  
            if ((year % 4 == 0 || year % 400 == 0) &&  
                month == 2 && (day > 0 && day <= 29)) { 
  
                // month starts at zero, so we need to put ( month - 1 ). 
                Calendar calendar = new GregorianCalendar(year, month - 1, day); 
                
               // System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
                return calendar.get(Calendar.DAY_OF_WEEK); 
            } 
        
            else { 
  
                // check the range of day of month 
                if (day > 0 && day <= darr[month - 1]) { 
  
                    // month starts at zero, so we need to put ( month - 1 ). 
                    Calendar calendar = new GregorianCalendar(year, month - 1, day); 
                   // System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
                    return calendar.get(Calendar.DAY_OF_WEEK); 
                } 
                else
                    return 0; 
            } 
        } 
        else
            return 0; 
    } 
//temperaturConversion-----------------------------------------------------------------------------------
	public class TemperaturConversion {
		
		// method to calculate the Celsius to Fahrenheit.....
		public void CelsiustoFahrenheit() { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  Celsius ");
		int c=sc.nextInt();
		 double F=((c * 9)/5) + 32; //formula for Celsius to Fahrenheit.....

System.out.println("your Fahrenheit value is "+ F);			
	}
// method is calculate the  Fahrenheit to Celsius
		public void FahrenheittoCelsius() {
			
			Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Fahrenheit ");		
			int F=sc.nextInt();
			
			double c=((F-32) * 5)/9;// formula for Fahrenheit to Celsius
System.out.println("Your Celsius value is "+c);
			
		}	
}

	// monthlyPayment-------------------------------------------------------------------------------------- 

	public static void  monthlyPayment() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the P value ");
		double P=sc.nextDouble();
		System.out.println("Enter the Y value ");
		double Y=sc.nextDouble();
		System.out.println("Enter the R value ");
		double R=sc.nextDouble();
		
		double n=12*Y;
		
		double r=R/(12*100);
		
		//double d=(1-(1+r));
		
		double d=Math.pow((1+r),-n);
		double payment =(P*r)/1-d;
		
		
	System.out.println("Your monthly payment is "+payment );
	
	
	}
//
	
	public static void Sqrt_newton() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st String");
		
		double c=sc.nextDouble();
		
		double epsilon=1e-15;
		/* if you multiply 10 000 000 000 * 10 000 000 000=the answer is too big so you will see 1e+20*/
		 double t=c;// estimate of the Square root of c......
		 
		 // repeaty desired percision is achieved 
		 while((Math.abs(t-c/t))>(epsilon *t)){
			 
			t=(c/t+t)/2.0; 
			 
		 }
		 // print out the estimate of the square root of c
		 System.out.println("The sqrt newton method value is: "+t);	
	}
	// Decimaltobinary--------------------------------------------------------------------------------  
	public static void Decimaltobinary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number tomconvert decimal ");
		int n=sc.nextInt();
		String str="";
		while(n!=0) {
			int r=n%2;
			
			str=r+str;
			
			n=n/2;
		}
		padding(str);
		//System.out.println(Integer.toBinaryString(n));
		System.out.println(str);
	}
	public static void padding(String str) {
		
		for(int i=str.length();i<32;i++) {
			
			
			str="0"+str;
			
			
		}
		System.out.println(str);
		
	}
	//Decimaltobinary and swapping the nibbles--------------------------------------------------------
	public static void convertswapping() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number tomconvert decimal ");
		int n=sc.nextInt();
		int t=n;
		String str="";
		while(n!=0) {
			int r=n%2;
			
			str=r+str;
			
			n=n/2;
		}
		System.out.println("decimal to binary value of "+t+" is "+str);
		swapping(str);
		
	}
	public static void swapping(String str) {
		
		if(str.length()%2==0) {
			char ch[]=str.toCharArray();
			char ch1[]=new char[str.length()/2];
			char ch2[]=new char[str.length()/2];
			for(int i=0;i<ch.length/2;i++) {
				
				 ch1[i]=ch[i];
			
				
			}
			int k=0;
			for(int i=ch.length/2;i<ch.length;i++) {
				ch2[k]=ch[i];
				k++;
			}
		//	System.out.println(new String(ch1));
			//System.out.println(new String(ch2));
			System.out.println("your swapping the value is "+new String(ch2)+new String(ch1));
			
		}
		else {
			System.out.println(" we can't split this into to two things");
		}	
	}	
	}