package com.techcanvas.day1;

public class Arthematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum = 5;
		int secondnum = 2;
		//int sum = firstnum+secondnum;
		//int diff = firstnum-secondnum;
		//int multi = firstnum*secondnum;
		//int div = firstnum/secondnum;
		//int rem = firstnum%secondnum;
		Arth MyOperation = new Arth();
		//System.out.println("sum = " + sum);
		//System.out.println("sum = " + addnumbers(firstnum, secondnum));
		//System.out.println("diff = " + diff);
		//System.out.println("sub = " + subnumbers(firstnum, secondnum));
		System.out.println("Addition = " + MyOperation.addnumbers(firstnum, secondnum));
		System.out.println("Subtraction = " + MyOperation.subnumbers(firstnum, secondnum));
		System.out.println("Multiplaction = " + MyOperation.multiplynumbers(firstnum, secondnum));
		System.out.println("Division = " + MyOperation.divisionnumbers(firstnum, secondnum));
		System.out.println("Reminder = " + MyOperation.remindernumbers(firstnum, secondnum));
		//System.out.println("multi = " + multi);
		//System.out.println("Multiply = "+ multiplynumbers(firstnum, secondnum));
		//System.out.println("div = " + div);
		//System.out.println("Rem = " + rem);
		//System.out.println("Division = "+ divisionnumbers(firstnum,secondnum));
		//System.out.println("Reminder = "+ remindernumbers(firstnum,secondnum));
	}
	
	//public static int addnumbers (int firstnum, int secondnum){
		//int sum=firstnum+secondnum;
		//return sum;
	//}
	//public static int subnumbers (int firstnum, int secondnum){
		//int sub=firstnum-secondnum;
		//return sub;
	//}
	//public static int multiplynumbers (int firstnum, int secondnum){
		//int multi=firstnum*secondnum;
		//return multi;
	//}
	//public static int divisionnumbers (int firstnum, int secondnum){
		//int div=firstnum/secondnum;
		//return div;
	//}
	//public static int remindernumbers (int firstnum, int secondnum){
		//int reminder=firstnum%secondnum;
		//return reminder;
	//}
}
