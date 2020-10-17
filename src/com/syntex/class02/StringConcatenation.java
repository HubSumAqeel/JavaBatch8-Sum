package com.syntex.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		String name="Olga";
		
		System.out.println("My name is"+name);
		String lastName="Sorrels";
		System.out.println(name+" "+lastName);
		
		String city="Miami";
		System.out.println(name+" lives in "+city);
		
		char grade='B';
		//olga is a B student
		System.out.println(name+" is "+grade+" student");
		
		int age=21;
		System.out.println(name+" is "+age+"years old");
		//to attach/concatenat any value (char, int, String, doule )
		
		int date=27;
		//27september
		String month="September";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherState="Capital ";
		//above Strings are not equal,
		//state has 2 characters and another has 3 characters
		
		System.out.println(state);
		System.out.println(anotherState);
		System.out.println(state+" is a "+anotherState);+
		
		
		
		
	}

}
