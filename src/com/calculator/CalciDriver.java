package com.calculator;

import java.util.Scanner;

public class CalciDriver {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.addition 2. subtration 3. multiplication 4. division");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter a Value");
			int a=sc.nextInt();
			System.out.println("Enter b Value");
			int b=sc.nextInt();
			
			CalciImplementation addition= new CalciImplementation();
			System.out.println(addition.add(a,b));
		}
		break;
		
		}
	}

}
