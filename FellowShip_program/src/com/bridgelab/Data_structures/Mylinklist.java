package com.bridgelab.Data_structures;

import java.util.LinkedList;

public class Mylinklist {

    class node {
	
	Object data;
	node next;
	
	public node(Object data) {
		
		this.data=data;	
	}
    }
	node head;
boolean add(Object ele) {
	
	node n=new node(ele);
	
	if(head==null) {
		head=n;
		return true;
		
	}
	node t=head;
	while(t.next!=null) {
		
		t=t.next;
	}	
	t.next=n;
	return true;
}	
public String toString() {
	node t=head;
	//int count=0;

while(t!=null)
{
	System.out.println(t.data+" ");
	//count++;
	t=t.next;
}
	return " ";
}

public boolean search(Object data)
{
	if(head==null)
	{
		System.out.println("no elements to search");
		return false;
	}
	node t=head;
	while(t!=null)
	{
		if(t.data.equals(data))
		{
			remove(data);
			return true;
		}
		
		t=t.next;
		
	}
	add(data);
	return true;
}
public boolean remove(Object data)
{
	node t=head;
	if(head==null)
	{
		System.out.println("no elements to delete");
		return false;
	}
	node prev=t;
	node temp=prev;
	while(t.next!=null)
	{
		// if search data is in head this if loop executed
		if(head.data.equals(data))
		{
			head=t.next;
			t.next=null;
			return true;
		}
		/*if(temp.data.equals(data) && prev!=head)
		{
			remove(data,t,prev);
			System.out.println(head.data+"------------------------");
			return true;
		}*/
		prev=t.next;
		// previous note is head this loop is executed..........
		if(prev.data.equals(data))
		{
			//System.out.println(t.data+" "+prev.data);
			remove(data,t,prev);
			System.out.println(head.data+"------------");

			return true;
		}
		t=t.next;
	}
	return true;
}

// remove the data in spicific index.........................
private void remove(Object data, node prev,node t) {
	if(head==null)
	{
		System.out.println("no element in the list");
	}
	else
	{
		prev.next=t.next;
		t.next=null;
	}
}



}
	
