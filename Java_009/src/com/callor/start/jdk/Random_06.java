package com.callor.start.jdk;

import java.util.Random;

public class Random_06 {

	public static void main(String[] args) {

		int Sum = 0;

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {

			int num = rnd.nextInt(100) + 1;

			boolean bYes = num < 34;

			if (bYes) {
				System.out.println(num + 1);
				break;
			}
		} 
	}

}
