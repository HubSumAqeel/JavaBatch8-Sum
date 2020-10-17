package com.syntex.class04;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		int num = 80;
		String str = "I am a String";
		
		Scanner scan= new Scanner(System.in);//enable input to the console
		//I am adding some message to the user
		System.out.println("Place enter any text");
		
		String value=scan.nextLine();//waits for your input and once you provided
		//input-->hit Enter 
		System.out.println("I captured String value = " +value);
		
		System.out.println("Place enter your name");
		String name = scan.nextLine();
		//System.out.println("Place enter your name");
		System.out.println("Nice to meet you "+name);
		
		String num1 = scan.nextLine();
		System.out.println("Place enter your name1 ="+ num1);
		//String num1 = scan.nextLine();
			

			
		
		
		

	}

}
