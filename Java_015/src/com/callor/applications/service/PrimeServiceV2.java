package com.callor.applications.service;

public class PrimeServiceV2 {
	
	public int prime(int Num) {

		
		for(int i = 2 ; i <Num ; i++) {
			if(Num % i == 0) {
				return -1;
			}
		}
		return Num;
	}
}