package com.technavas.selenium;

public class TestingException {

	public static void main(String[] args) {
	try {
		// TODO Auto-generated method stub
				int a = 5;
				int b = 0;
				//System.out.println(a/b);
				
			    int num[] = {1,2,3};
				//System.out.println(num[4]);
				
				String name = null;
			    //System.out.println(name.length());
			    
			  //Thread.sleep(2000);
			
	} catch (ArithmeticException e) {
		// TODO: handle exception
		//e.printStackTrace();
		//e.getClass();
		System.out.println("Inside ArithmeticException");
	}catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("Inside NullPointerExecption");
	}catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("Inside ArrayIndexOutOfBoundsExecption");
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Some Technical error, please try after some time");
	}finally {
		System.out.println("I am inside finally block");
	}
	}	

}
