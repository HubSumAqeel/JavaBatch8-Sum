package com.syntax.class07;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double math = 0;
		System.out.println("Enter first number, operator and second number of your choice!");
		double numberOne = scan.nextDouble();
		char operator = scan.next().charAt(0);
		double numberTwo = scan.nextDouble();
		if (numberTwo == 0 && (operator == '/')) {
			System.out.println("Total= " + numberOne);
		} else if (numberOne == 0 || numberTwo == 0 && (operator == '*')) {
			System.out.println("Total= " + (0));
		} else {
			switch (operator) {
			case '+':
				math = numberOne + numberTwo;
				break;
			case '-':
				math = numberOne - numberTwo;
				break;
			case '*':
				math = numberOne * numberTwo;
				break;
			case '/':
				math = numberOne / numberTwo;
				break;
			default:
				System.out.println("ERROR");
			}
			System.out.println("Total= " + math);
		}
	}
}

	


