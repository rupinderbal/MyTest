package com.techcanvas.day1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MyMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashedMap<Integer, String> myMap = new HashedMap<Integer, String>();
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
		//LinkedHashMap<Integer, String> myMap = new LinkedHashMap<Integer, String>();
		myMap.put(701, "Rupinder");
		myMap.put(102, "Rup");
		myMap.put(405, "Sai");
		myMap.put(101, "Stuart");
		
		System.out.println(myMap);
		
		Set<Integer> keys = myMap.keySet();
		
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			System.out.println(myMap.get(key));
			
		}
		
		

	}

}
