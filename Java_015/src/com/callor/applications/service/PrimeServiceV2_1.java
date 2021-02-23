package com.callor.applications.service;

public class PrimeServiceV2_1 {

	public int prime(int intNums) {

		for (int index = 2; index < intNums; index++) {
			if (intNums % index == 0) {
				return -1;
			}
		}
		return intNums;

	}
}