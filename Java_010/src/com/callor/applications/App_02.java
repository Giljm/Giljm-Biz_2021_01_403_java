package com.callor.applications;

import java.util.Scanner;

public class App_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("(2 ~ 9) \n");
		System.out.print("숫자입력 >> ");
		int keyNum1 = scan.nextInt();

		boolean bYes = (keyNum1 > 1 && keyNum1 < 10);

		if (bYes) {

			System.out.println("Good");
			System.out.println("=============================");
			System.out.println(" 구구단  (2 ~ 9 까지만 계산)");
			System.out.println("=============================");

			for (int i = 2; i < 10; i++) {
				int gob = keyNum1 * i;
				System.out.println(keyNum1 + " x " + i + " = " + gob);
			}

		} else {
			System.out.println("!!!!!!!!");

		}

	}
}
