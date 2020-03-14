package com.technavas.selenium;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		Scanner myScan = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int num = Integer.parseInt(myScan.next());
		while (count <=10){
		System.out.println(num*count);
		count++;
			
		}
	}

}
