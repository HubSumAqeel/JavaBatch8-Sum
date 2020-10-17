package com.syntex.class04;

public class sequenceIsImportent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Check if assignment is completed 
		 * if assignment is completed:
		 * 		if score > 90--> great job
		 * 		if score > 80--> good job
		 * 		if score > 70--> please study more
		 */
		
		
		//debug your cod later and analyze what is the issue!!
		//do not make that mistake!!!!
		
		int score =85;
		boolean assignment=true;
		
		if(assignment) {
			if (score>90) {
			System.out.println("You did great!!!!!!");
			}else if(score>70) {//Spouse to print the next one
				System.out.println("probably you need to study more");
			}else if(score>80) {
				System.out.println("You did good!");
			}else {
				System.out.println("Good job for trying but you must study");
				
			}
		}else {
			System.out.println("You should always compleat all assignments");
		
		
				
}
}
		
		
	}


