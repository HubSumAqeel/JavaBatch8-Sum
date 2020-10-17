package com.syntex.class03;

public class taskIfElse02 {

	public static void main(String[] args) {
/*1, Create a Java program and name it Double Comparison.Declare 2 double values
 * and if value of first variable is higher then the second, print "Double value
 *  _ is larger than -",Otherwise print.....
 *2, Create a Java program and name it Temperature Check. Create variable to store 
 *temperature.Your program should check if temperature is below 32 then it should  
 *print "water will freeze with temperature _ ," otherwise "Water will Not freeze
 *with temperature.
		 */ 
		Double num1=3.0;
		Double num2 = 4.0;
		if(num1>num2) {
		 System.out.println("Double value of num1 is " +num1+" larger than num2 "+num2 );	
		}else {
			System.out.println("The "+num1+ " is smaller then "+num2);
		}
	
	System.out.println("-------------------------");
	
	double temp = -30; 
	if (temp<-32) {
		System.out.println("Water will freeze with temperature "+temp);
	}else {
		System.out.println("Water will not freeze "+temp);
	}
	}
}
