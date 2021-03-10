package com.callor.student;

import java.util.Scanner;

/*
 * ==================
 * 구구단 7단
 * ------------------
 * 7 x 1 = 7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * 7 x 4 = 28
 * 7 x 5 = 35
 * 7 x 6 = 42
 * 7 x 7 = 49
 * 7 x 8 = 56
 * 7 x 9 = 63
 * ==================
 * 
 */
public class Ex_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();

		for (int i = 1; i < 10; i++) {

			int num = dan * i;
			System.out.println(num);

		}

	}

}
