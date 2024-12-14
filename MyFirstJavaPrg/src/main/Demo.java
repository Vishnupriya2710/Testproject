package main;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		int base = 0;
		int height =0;
		
		int area = 0;
		
		Scanner s =new Scanner (System.in);
		
		System.out.println("enter the base of triangle");
		base = s.nextInt();
		
		System.out.println("enter the height of triangle");
		height = s.nextInt();
		
		area =(base*height)/2;
		
		System.out.println("Area of triangle is " + area);
	}
}

