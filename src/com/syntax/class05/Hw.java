package com.syntax.class05;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {
		/* Create a Java program that will ask if user has credit card not. 
		 * If you user does not have a credit card then offer them.
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000; 
		 * tell them to pay off immediately; otherwise you can tell 
		 * them that they can spend more.
		 */ 
		//different way of declaring variable
		int a=10;
		int b;
		b=20;
		
		Scanner scan;
		boolean answer;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Pleace enter if you have a credit card(true/false)");//1
		
		answer=scan.nextBoolean();//2
		
		if(answer) {
			System.out.println("What is the balance on your card");
			balance=scan.nextDouble();
			
			if(balance>1000) {//6
				System.out.println("Pleace pay off your card balance");//7
			}else {//8
				System.out.println("you can spend more $$");//9
			}
			
		}else {
		
			System.out.println("Would you like to get a credit card");//3
		}
		

	}

}
