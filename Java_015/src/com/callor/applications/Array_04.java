package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {
	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int[] intNums = new int[100];

		for (int index = 0; index < intNums.length; index++) {
			intNums[index] = rnd.nextInt(10) + 1;
		} // 1 ~ 10까지 배열 저장

		System.out.print("번호 입력 >>");
		int keyScan = scan.nextInt();
		// 키보드 값 입력

		// 변수는 앞에서 어떤 값을 저장했던 상관 없이
		// 가장 마지막에 저장한 값만 가지고 있다.
		
		int result = 0;
		for (int index = 0; index < intNums.length; index++) {
			boolean bYes = intNums[index] == keyScan;
			if (bYes) {
				// 키보드로 입력한 값이 일치 할때마다
				// 그 위치를 result에 저장
				result = index;
			}
		} // for end
		System.out.printf("%d 마지막 위치", result);
	}
}