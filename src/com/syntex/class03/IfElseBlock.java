package com.syntex.class03;

public class IfElseBlock {

	public static void main(String[] args) {
	double money=20;
	double iceCream=5.59;
	if (money>=iceCream) {
		System.out.println("I am buying cream");
		System.out.println("I would like vanilla flavor");
	}else {
		System.out.println("Sorry no ice cream ((");
		System.out.println("Do not worry, less sugar for you ");
	}
	System.out.println("I am code that exectes without any condition");
	
	System.out.println("------------------------");
	
	boolean sleepy=false;
	// if not sleepy --> I will study otherwise I will take a nap
	
	if (sleepy) {
		System.out.println("I will take a nap");
	}else {
		System.out.println("I will study some java");
		
		System.out.println("-------------");
		
		boolean hungry=true;
		if (hungry) {
			System.out.println("If I am hungry I will eat ");
		}else{
			System.out.println("If I am not hungry I will not eat ");
		}
		
		
		
		
		
	}
	}

}
