package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_06 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		} // intNums에 1 ~ 10까지의 랜덤수를 담는다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		System.out.println(">>");
		int keyNum = scan.nextInt();
		// 입력하고 keyNum에 입력값을 담음
		
		
		int pos = 0;
		for (pos = 0; pos < intNums.length ; pos++) {
			if(intNums[pos] == keyNum) {
				break;
			}
		}
		if(pos < intNums.length) {
			System.out.println(pos + "위치에서 최초 발견");
		} else {
			System.out.println("없음");
		}
	}
}
