package com.syntex.class04;

public class NestedIf {

	public static void main(String[] args) {

		/*
		 * variable for allergy -yes or no if allergy is yes--> We will check if
		 */

		boolean allergy = true;
		boolean petAllergy = true;

		if (allergy) {// true
			System.out.println("Lets do further check ");

			if (petAllergy) {
				System.out.println("Please no cat or dog in the house");
			} else {
				System.out.println("That is good you do not have pet allergy");
			}
		} else {
			System.out.println("You are lucky");
		}
		System.out.println("-------------EXAMPLE 2-----------------");

		/*
		 * If todays is Friday we will watch movie but would like to check the date If
		 * date is 13 --> watch scary movie and if it is not --> I will watch
		 * comedy,action If no Friday --> I am studying
		 */

		boolean isFriday = false;
		int date = 14;
		boolean monday=true;
		
		if (isFriday) {

			if (date == 14) {

				System.out.println("will watch movie scsry movie");
			}else {
				System.out.println("I will watch PK moview with Amir Khan");
			}

		} else {
			if(monday) {
				System.out.println("I am not studaying, I am working");
			}else {
			System.out.println("I have class at Syntax");
		}
		}
		System.out.println("---------EXAMPLE 3------------------");
	

		/*Check if assignment is completed 
		 * if assignment is completed:
		 * 		if score > 90--> great job
		 * 		if score > 80--> good job
		 * 		if score > 70--> please study more
		 */
		 
		int score =75;
		boolean assignment=true;
		
		if(assignment) {
			if (score>90) {
			System.out.println("You did great!!!!!!");
			}else if(score>80) {
				System.out.println("You did good!");
			}else if(score>70) {
				System.out.println("probably you need to study more");
			}else {
				System.out.println("Good job for trying but you must study");
				
			}
		}else {
			System.out.println("You should always compleat all assignments");
		
		
		
}
}
}		
		