package com.version1;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=obj.nextInt();
		System.out.println("Enter a value:");
		int b=obj.nextInt();
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
}
