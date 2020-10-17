package com.syntex.class04;

public class repal013 {

	public static void main(String[] args) {
		

		/*Create an int variable called myNumber. Set it equal to any number other than 0.
We will refer to myNumber as the original number from now on.
1,,,Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.

2,,Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).

3,,Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.

4,,Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.

5,Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.

6,,Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.

Let's print out the value of the last step as: "The magic number is _ !"
Now try running your code! What number is printed to the console?
Now, go back to your code and change myNumber to any other integer. 
Run your program again.
Is the output the same? 
It's math magic!

Output:
The magic number is _!
*/
		int myNumber = 10;
		int stepOne  = myNumber;
		
		int result = myNumber * myNumber;
		System.out.println(result);
		
		int stepTwo = result+ myNumber ; 
		System.out.println(stepTwo);
		
		int stepThree = stepTwo * myNumber;
		System.out.println(stepThree);
		
		int stepFour = stepThree + 17;// 4
		System.out.println(stepFour);
		
		int stepFive = stepFour - myNumber;
		System.out.println(stepFive);
		
		int stepSix = stepFive / 5;
		System.out.println("The magic number is " + stepSix);
		

		 
	}
	
}
