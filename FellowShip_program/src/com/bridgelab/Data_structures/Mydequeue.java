package com.bridgelab.Data_structures;

public class Mydequeue {

	    int cap,front;
	    int rear=-1;
	    
	    Object q[];
	
	Mydequeue(int scap){
		
		this.cap=scap;
		
		q=new Object[cap];
		front=cap-1;
		
	}
	boolean addrear(Object obj) {
		
		if(rear==cap-1) {
			System.out.println("not able to add");
			return true;
		}
		
		q[++rear]=obj;
		return true;
		
	}
	boolean addfront(Object obj) {
		
		if(front==rear) {
			System.out.println("queue is full");
			return true;
		}
		
		q[front--]=obj;
		return true;	
	}
	Object removerear() {
		if(rear==-1) {
			System.out.println("queue is null");
			return null;
		}
		
		return q[rear--];
	}
	
	//@Override
//	public String toString() {
//		if(rear<=cap-1 && rear>0)
//		{
//			for(int i=0;i<=rear;i++)
//			{
//				System.out.print(q[i]+" ");
//			}
//		}
//		else
//		{
//			for(int i=cap-1;i>front;i--)
//			{
//				System.out.println("hi");
//				System.out.println(q[i]+" ");
//		}
//		}
//		return "";
//	}
	
	
	public String toString() {
		String st="";
		for(int i=0;i<=front-1;i++) {
			st=st+q[i]+" ";
		}
		
		return  st;
		
	}
	
	Object removefront() {
		
		if(front==cap) {
			System.out.println("not able to remove");
			return null;
		}
		
		return q[++front];
		
	}
}
