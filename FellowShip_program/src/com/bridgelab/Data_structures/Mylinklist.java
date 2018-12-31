package com.bridgelab.Data_structures;

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
	int count=0;

while(t!=null)
{
	System.out.println(t.data+" ");
	count++;
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
private void remove(Object data) {
	
	
}




}
	
