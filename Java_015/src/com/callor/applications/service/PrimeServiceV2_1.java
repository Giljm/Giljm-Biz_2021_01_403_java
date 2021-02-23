package com.callor.applications.service;

public class PrimeServiceV2_1 {

	public int prime(int keyScan) {

		int index = 0;
		for (index = 2; index < keyScan; index++) {
			if (keyScan % index == 0) {
				break;
			}
		}

		if (index < keyScan) { // 소수가 아니다
			// prime() method 실행을 중단하고
			// main method에게 -1 을 되돌려줘라
			return -1;

		} else { // 소수다

			// keyScan 값이 소수이어서 for() 반복문을 모두 수행하고
			// 여기에 다다르면 keyScan 값을 그대로 return 하라
			return keyScan;
		}

	}
}