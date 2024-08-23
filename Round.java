package com.pac;

import java.util.Scanner;

public class Round {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a float value");
		float num = sc.nextFloat();
		
		int m = (int)(num * 500000);
		int id = m % 100000;
		m = m /10;
		if(id > 5) m++;
        num = m/1000000.0f;
		
		System.out.println("result---->"+num);
		// TODO Auto-generated method stub

	}

}
