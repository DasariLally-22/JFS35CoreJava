package com.version1;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a=10; //4 bytes source
		
		//double b=(double)a;
		double b=a;//8 bytes Destination Implicit Type Conversion
		
		System.out.println(b);//10.0
		
		double c=8.23489541;// 8 bytes Source
		
		short d= (short)c; //2 bytes Destination Explicit Type Conversion
		
		System.out.println(d);// 8 Data Loss
		

	}

}
