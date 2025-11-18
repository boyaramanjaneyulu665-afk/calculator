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
			
			CalciImplementation addition= new CalciImplementation();
			addition.add(10, 30);
		}
		break;
		
		}
	}

}
