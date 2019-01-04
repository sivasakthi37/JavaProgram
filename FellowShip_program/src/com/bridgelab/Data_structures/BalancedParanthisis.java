package com.bridgelab.Data_structures;
import java.util.Scanner;
public class BalancedParanthisis {

	
	public static void main(String[] args) {
		
	//Mystack mystack=new Mystack(5);
Scanner sc=new Scanner(System.in);
System.out.println("Enter your String");
 String st=sc.nextLine();

 
 boolean b=isbalanced(st);
 
 if(b==true) {
	 System.out.println("your String is balanced");
 }
 else {
	 System.out.println("Your String is not balanced");
 }
	}
static	boolean isbalanced(String st)
	{	
		
	char ch[]=st.toCharArray();
	

	Mystack m=new Mystack(ch.length); 
	System.out.println(m);
	for(int i=0;i<ch.length;i++) {
		
		if(ch[i]=='{'||ch[i]=='['||ch[i]=='(') {
			m.push(ch[i]);
			//System.out.println(m.peek());
		}
		
		else {
			switch(ch[i]) {
		
			case ')':if ((char)m.pop()!='(' ) {
				//System.out.println(m.peek());//(m.pop()!='(')
				return false;
			}
				break;
			case '}':if ((char)m.pop()!='{' )                 //(m.pop()!='(')
				return false;
			break;
				
			case ']':if ((char)m.pop()!='[' )                 //(m.pop()!='(')
				return false;
			break;
				
			}
			
		}
		
	}
	return m.isempty();
	
	
		
	}
	
	
	
	
	
	
	
	
	
}
