package com.syntex.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//Casting in java -->converting 1 type to another 
		//2 type of casting:
		//widening - implicit (automatic)
		//byte-> short-> int -> long-> flost -> double 
		//narrow - explicit (manual) 
		//from bigger box to small
		//double -> float -> long -> int-> short-> byte
				
		double d = 12/7;
		System.out.println(d);
		
		double e = 9;//widening 
		System.out.println(e);
		
		// 
		 
		//int num=9.89;//error
		int i = (int)9.99;// narrowing
		System.out.println(i);
		
		byte b = (byte)130;//narrowing 
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
