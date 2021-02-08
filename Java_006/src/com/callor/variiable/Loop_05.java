package com.callor.variiable;

public class Loop_05 {

	public static void main(String[] args) {
		
		int intDan = 7; //메인메소드 스코프, 영역, 베어리얼, 로컬 에어리어
		for (int num = 1; num < 10 ; num += 1) {
			
		}
		
		for (int num = 1 ; num < 100 ; num += 1) {
			
		}
		
		for(int num = 20 ; num < 42 ; num += 1) {
			System.out.println("안녕");
		}
		//  시작하는값  //비교하는값  //증가하는값
		for(int num = 12 ; num <= 20 ; num += 1) {
			
		}
		
		for(int num = 12 ; num <= 20 ; num += 2) {
			System.out.println("상한가");
		}
		
	}

}
