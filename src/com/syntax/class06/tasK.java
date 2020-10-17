package com.syntax.class06;

import java.util.Scanner;

public class tasK {

	public static void main(String[] args) {
		/*
		 * if price 10 to 50 --> We give 10% discount
		 * if price is between 50 -100 -->20% discount
		 * if price is between 100 - 500 -->40%
		 * if price is more than 500--> 50
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("is everything on sale? true/false");
		boolean sale = input.nextBoolean();
		double discount =0;
		if(sale) {
			System.out.println("how much is the item?");
			double price = input.nextDouble();
			if(price > 10 && price < 50){
				discount = .10;
			}else if{
			
			
		}
		
		
		
		
		
	}
	}
}
