package com.pac;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Scanner sc;// null
		sc= new Scanner(System.in);
		
		System.out.println("please  enter  int number");
		int nInt = sc.nextInt();
		System.out.println("please  enter  float number");
		float num = sc.nextFloat();
		System.out.println("please  enter  int number");
		int mInt = sc.nextInt();
		
		System.out.println("enter a Name");
		String name = sc.next();
		
		System.out.println("enter a Char");
		String charData = sc.next();
		char ch  = charData.charAt(0);
		
		
		
		System.out.println("first int--->"+nInt);
		System.out.println("float no--->"+num);
		System.out.println("second int--->"+mInt);
		System.out.println("name--->"+name);
		System.out.println("char data--->"+ch);
			
		
		System.out.println("Ends");
		



	}

}
