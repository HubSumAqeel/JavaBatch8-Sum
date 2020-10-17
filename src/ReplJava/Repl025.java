package ReplJava;

import java.util.Scanner;

public class Repl025 {

	public static void main(String[] args) {
		
/*For you to do: 
*The variable "num" holds an integer input from a user
*Write a conditional statement starting on line 9 that
* does the following:
*If num is positive, print "__ is positive"
*If num is negative, print "__ is negative"
*If num is equals to 0, then print "Entered number is
* equals to 0"

 *Examples:
 *In: 5
 *5 is positive
 *In: -2
 *-2 is negative
 *In: 0
 *Entered number is equals to 0
*/
		
	Scanner inp=new Scanner(System.in);
	System.out.println("In");
	int num=inp.nextInt();
	
	if(num>=5) {
		System.out.println(num+" is positive");
		
	}else {
		System.out.println(num+"is not positive");
	}
	System.out.println("In:");
	int num1=inp.nextInt();
	
	if(num1<=0) {
		System.out.println(num1+" is negative");
	}else {
		System.out.println(num1+" is positive");
	}
	System.out.println("In ");
	int num2=inp.nextInt();
	
	if (num2==0) {
		System.out.println("Enter number is equals to "+num2);
	}else {
		System.out.println(num2+" is not equal to zero");
	}
	}		
}	
		