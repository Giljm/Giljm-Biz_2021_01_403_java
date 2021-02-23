package com.callor.applications.service;

public class PrimeServiceV1 {

	public void prime(int keyScan) {
						// 메인 method 에서 넘어온 keyScan을 입력
		int index = 0;
		for (index = 2; index < keyScan; index++) {
			if (keyScan % index == 0) {
				break;
			}
		}

		if (index < keyScan) {
			System.out.printf("%d 은(는) 소수가 아니다", keyScan);
		} else {
			System.out.printf("%d 은(는) 소수다", keyScan);
		} // 소수 구하는 공식
	}
}