package com.technavas.selenium;

public class ArrayTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		int numbers[][]= {{1,2,3},{4,5,6},{7,8,9,0}};
		//int numbers[] = {3,2,7,9};
		//String names[] = {"rupinder","reena","swathi"};
		 /*int numbers[] = new int[4];
		 numbers[0] = 3;
		 numbers[1] = 2;
		 numbers[2] = 7;
		 numbers[3] = 9;*/
		
		System.out.println(numbers.length);
	
		//System.out.println(names.length);
		//System.out.println("Size = "+numbers.length);
		//System.out.println("Size = "+names.length);
		System.out.println("********");
		//for (int i = 0; i < names.length; i++) {
		//System.out.println(names[i]);	
		//}	
		//}
		for (int row = 0; row < numbers.length; row++) {
		System.out.println();	
		for (int col = 0; col < numbers[row].length; col++) {
	    System.out.print(numbers[row][col]+"\t");
		}
		}
	}
}
		
	


