package com.bridgelab.Data_structures;

public class Myqueue {

	Object q[];
	
	int capacity;
	int front,rear;
	Myqueue(int  capacity){
		
		this.capacity=capacity;
		rear=front=-1;
		q=new Object[capacity];
	
	}
	
	boolean enque(Object obj) {
		
		if(rear==capacity-1) {
			System.out.println("Statck is full");
			return false;
		}
		if(front==-1) 
			front++;
			q[++rear]=obj;
			return true;
	}
	
public String toString ()
{
	String st="[";
	
	for(int i=front;i<=rear;i++) {
	st=st+q[i]+" ";
	
	
	}
	return st+"]";
}
	
	
	
	
	
}
