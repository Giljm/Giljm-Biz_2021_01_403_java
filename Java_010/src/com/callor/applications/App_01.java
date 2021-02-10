package com.callor.applications;

import java.util.Scanner;

public class App_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int keyNum1 = scan.nextInt();

		System.out.println("===============");
		System.out.println("구구단 7단");
		System.out.println("---------------");

		for (int i = 2; i <= 9; i++) {

			int gob = keyNum1 * i;
			
			System.out.println(keyNum1 + "x" + i + " = " + gob);

		}

	}
}
