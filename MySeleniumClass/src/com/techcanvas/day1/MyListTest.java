package com.techcanvas.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<String> myList = new ArrayList<String>();
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Rupinder");
		myList.add("Rupinder");
		myList.add("Rajnish");
		myList.add("Rup");
		
		System.out.println(myList.size());
		System.out.println(myList.get(3));
		System.out.println(myList);
		
		for (Iterator iterator = myList.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}

	}

}
