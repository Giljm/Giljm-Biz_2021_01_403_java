package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 >>");
		
		int keyScan = scan.nextInt();

		int index = 0;
		for (index = 2; index < keyScan; index++) {
			if (keyScan % index == 0) {
				break;
			}
		}
		// if(index == keyScan){ 소수인 경우 }
		
		if (index < keyScan) {
			System.out.printf("%d 는 소수가 아니다", keyScan);
		} else {
			System.out.printf("%d 는 소수다", keyScan);
		}
	}
}