package com.practice;

import java.util.ArrayList;

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
		
		
	}

}
