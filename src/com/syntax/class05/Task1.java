package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan;
		double workedYears;
		int annualSalary;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter number if worked years");
		workedYears=scan.nextDouble();
		
		if (workedYears >= 5) {
			System.out.println("You are eligible for a bouns!");
			System.out.println("Please enter your annual salary");
			annualSalary = scan.nextInt();
			if(annualSalary> 50000) {
				System.out.println("Your bounsis 3000");
			}
		}else {
			System.out.println("Sorry, no bouns for you");
		}
	}
}	