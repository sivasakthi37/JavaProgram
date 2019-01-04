package com.bridgelab.Data_structures;
import java.util.Scanner;
public class Bankcashcounter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
//		
//		m.enque(10);
//		m.enque(20);
//		m.enque(49);
//		System.out.println(m);
//		System.out.println(m.isempty());
//		System.out.println(m.size());
//		
	System.out.println("Enter the number of people in the queue");
	
	int num=sc.nextInt();
	
	Myqueue m=new Myqueue(num);
	for(int i=0;i<num;i++) {
		
		System.out.println("Enter the names ");
		String st=sc.next();
		
		m.enque(st);
		
	}
	System.out.println(m);	
	int totalamount=2000;
	for(int i=0;i<num;i++) {	
	
	System.out.println("---------------bank Cash Counter----------------------------------");
	
	System.out.println("welcome "+m.deque()+" plz Enter your choice");
	System.out.println("1.. withdraw \n 2..deposit  \n 3..balance enquery \n 4..no of persence \n 5..exit ");
	
	int choice=sc.nextInt();
	
	if(choice==1){
		
                 System.out.println("Enter your withdraw AMOUNT");
                 int amount=sc.nextInt();
                 if(totalamount >amount) {
                 totalamount=totalamount-amount;
                 System.out.println("after withdraw your bank balance is " +totalamount);
                 }
                 else {
                	 System.out.println("no amount in the bank to withdraw");
                 }
                 //m.deque();
	             
	             
	}
	else if(choice==2){
		
		          System.out.println("Enter the deposit amount ");
		          int amount1=sc.nextInt();
		          totalamount =totalamount+amount1;
		          System.out.println("bank balance after depost "+totalamount);
		          
		          
	             }
	
	else if(choice==3){
		
		         System.out.println(" balance avalable on bsnk is "+totalamount);
		         
		
	      }
	
	else if(choice==4){
	
         System.out.println("number of persence is "+num);
          
           
	}
	else if(choice==5){
		System.exit(0);
	}
	
	}
	
	}
}
