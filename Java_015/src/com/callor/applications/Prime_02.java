package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV1;

public class Prime_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrimeServiceV1 psV1 = new PrimeServiceV1();

		System.out.print("숫자 입력 >> ");
		int keyScan = scan.nextInt();
		// 여기까지 입력 다음에는 이 값을 ServiceV1으로 넘긴다.

		psV1.prime(keyScan);

	}
}
