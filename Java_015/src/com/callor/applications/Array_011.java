package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_011 {
	public static void main(String[] args) {

		// 키보드 입력을 받기 위해 Scanner 클래스를 scan 객체로 선언
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int[] intNums = new int[100];
		int count = 0;

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		System.out.print("숫자 >>");
		int keyNum = scan.nextInt();
		// 위에 불러온 스캐너 클래스를 이용해 키보드로 입력

		// intNums에는 어떤 값이 저장되어있는지는 모르지만,
		// 1 ~ 10까지의 숫자들이 들어 있을 것이라는건 알 수 있다.
		// intNums 배열에 저장된 숫자들 중에서 키보드로 입력받은 값과 같은 값들이
		// 몇 개 저장되어있는지 알고 싶다.

		for (int i = 0; i < intNums.length; i++) {
			boolean bYes = intNums[i] == keyNum;
			if (bYes) {
				// 카운트를 센다
				count ++;
				System.out.println(intNums[i]);
			}
		}System.out.println(keyNum + "의 갯수 : " + count);
	}
}