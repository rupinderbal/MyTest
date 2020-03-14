package com.techcanvas.day1;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FirstName = "Rupinder";
		String LastName = "Bal";
		String CompareText = "RUPINDER";
		String TrimText = "     Rupinder  Bal     ";
		String Text = "I Live in Edinburgh";
		
		System.out.println(FirstName.length());
		System.out.println(FirstName.charAt(5));
		System.out.println(FirstName.concat(" ").concat(LastName));
		System.out.println(FirstName +" "+LastName);
		System.out.println(FirstName.toLowerCase());
		System.out.println(FirstName.toUpperCase());
		System.out.println(FirstName.equals(CompareText));
		System.out.println(FirstName.equalsIgnoreCase(CompareText));
		System.out.println(FirstName.replace('p', 'x'));
		System.out.println(FirstName.replace("Rup", "Abc"));
		System.out.println(FirstName.substring(3));
		System.out.println(FirstName.substring(3, 5));
		System.out.println(TrimText.length());
		System.out.println(TrimText.trim());
		String Values[] = Text.split(" ");
		System.out.println(Values.length);
		System.out.println(Values[0]);
		System.out.println(Values[1]);
		System.out.println(Values[2]);
		System.out.println(Values[3]);
		
		
	}

}
