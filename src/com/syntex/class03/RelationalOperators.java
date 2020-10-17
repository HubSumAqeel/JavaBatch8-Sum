package com.syntex.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		 System.out.println(a>b);//false
		 System.out.println(a<b);//true
		 System.out.println(a==b);//false
		 System.out.println(a!=b);//true
		 
		 int x=100;
		 int y= 90;
		 boolean result = x > y;//true
		 System.out.println(result);
		 
		 result = x==y;
		 System.out.println(result);
		 System.out.println("--------");
		 System.out.println(x==y);//compare
		 System.out.println(x=y);//assigning value of y to variable x (90)
		 System.out.println("-----------");
		 System.out.println(y=x);//90
		 System.out.println("----------------");
		 boolean result1 = x==y;//true
		 System.out.println(result1);
		 
		 byte num=10;
		 byte num1=10;
		 
		 boolean boo = num > num1;//false
		 System.out.println(boo);
		 
		 boolean boo1 = num >= num1;//true
		 System.out.println("Result of boo1 is " +boo1);
		 
	}

}
