package com.bridgelab.Data_structures;

public class Mystack {

	Object st[];
	
	int capacity;
	int top=-1;
	Mystack(int capacity){
		
		this.capacity=capacity;
		st=new Object[capacity];
		
		
	}
	public boolean push(Object ele) {
		
		if(top==capacity-1) {
			System.out.println("Stack is overflow");
			return false;
		}
		st[++top]=ele;
		return true;
	}
	public String toString() {
		
		String str="[";
		for(int i=0;i<=top;i++) {
			str=str+st[i]+" ";
			
		}
		return str+"]";
	}
	public  Object pop() {
		if(top==-1) {
			System.out.println("stack  underflow");
			return null;
		}
		return st[top--];	
	}
	public Object peek() {
		
if(top==-1) {
	
	System.out.println("stack is empty");
	return null;
	
}
		return st[top];	
	}
	public boolean isempty() {
		
		if(top==-1) {
			
			return true;
		}
		return false;
		
	}
	public int size() {
		
		
		return top+1;
	}
	
}
