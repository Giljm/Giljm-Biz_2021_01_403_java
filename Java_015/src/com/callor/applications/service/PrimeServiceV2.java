package com.callor.applications.service;

public class PrimeServiceV2 {
	
	public int prime(int intNum) {

		
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				return -1;
			}
		}
		return intNum;
	}
}