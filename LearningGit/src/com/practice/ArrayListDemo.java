package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Indore");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Banglore");
		
		System.out.println(al);
		
		for(String s:al) {
			
			System.out.println(s);
		}
		
	   Iterator<String> itr =al.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
	   }
	   
	   System.out.println("ArrayList info ");
		
	}

}
