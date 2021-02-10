package com.callor.applications;

import java.util.Scanner;

public class App_01_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자입력 (2 ~ 9) >>");
		int intNum1 = scan.nextInt();
		
		System.out.println("====================");
		System.out.println("       구구단");
		System.out.println("====================");
		
		for (int i = 1; i < 8 ; i++) {
			int gob = intNum1 * i;
			System.out.println(intNum1 + " x " + i + " = " + gob);
		}
		
	}
}
