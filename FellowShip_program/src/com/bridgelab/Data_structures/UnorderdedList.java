package com.bridgelab.Data_structures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
public class UnorderdedList {

	public static void main(String[] args) throws IOException {
		
		FileReader filereader=new FileReader("/home/bridgeit/Documents/read.txt");
		BufferedReader bufferreader=new BufferedReader(filereader);
		
		/*LinkedList <String> lt=new LinkedList <String>();
		
		lt.add("Sivasakhti");
		lt.add("arun");
		System.out.println(lt);*/
		
		String line;
		Mylinklist linklist=new Mylinklist();
		Scanner sc=new Scanner(System.in);
		//System.out.println(bufferreader.readLine());
		
		while((line=bufferreader.readLine())!=null) {
			
			String words[]=line.split(" ");
			
			for(int i=0;i<words.length;i++) {
				linklist.add(words[i]);
			}
			
		}
			//linklist.display();
			System.out.println(linklist);
			
			String check=null;
			  do
			  {
				  System.out.println("enter the search word");
				  String word=sc.next();
				  linklist.search(word);
				  System.out.println("after search");
				  System.out.println(linklist);
				  System.out.println("u want to continue the search  yes or no");
				  check=sc.next();
			  }while(check.equalsIgnoreCase("yes"));
			  
	               	
}
}

	

