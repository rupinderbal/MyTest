package com.techcanvas.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MySetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet<String> mySet = new HashSet<String>();
		LinkedHashSet<String> mySet =  new LinkedHashSet<String>();
		mySet.add("Rupinder");
		mySet.add("Rupinder");
		mySet.add("Rajnish");
		mySet.add("Rup");
		
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		for (Iterator iterator = mySet.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}
	}

}
