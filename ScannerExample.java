package com.version1;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter byte value:");
		byte a=obj.nextByte();
		
		System.out.println("Enter short value:");
		short b=obj.nextShort();
		
		System.out.println("Enter int value:");
		int c=obj.nextInt();

		System.out.println("Enter long value:");
		long d=obj.nextLong();
		
		System.out.println("Enter float value:");
		float e=obj.nextFloat();

		System.out.println("Enter double value:");
		double f=obj.nextDouble();
		
		System.out.println("Enter boolean value:");
		boolean g=obj.nextBoolean();

		System.out.println("Enter String value:");
		String h=obj.next();

		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);

	}

}
