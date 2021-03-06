package com.callor.applications.service;

public class ScoreServiceV3 {
	public void sum(int num1, int num2) {
		// 정수형 매개변수 2개를 전달받고
		// 호출 할 수 있는 method
		System.out.println("정수 숫자 2개");
		System.out.println(num1 + num2);
	}
	
	// 매개변수가 하나도 없이
	// 호출 할 수 있는 method
	// sum() 메서드에서는 실수값 1과 실수값 2를 전달 받는 2개의 매개변수가 있다.
	public void sum() {
		System.out.println("매개변수 없음");
	}
	
	// float형 매개변수 2개를 전달받고
	// 호출 할 수 있는 method
	public void sum(float f1, float f2) {
		System.out.println("실수 숫자 2개");
		System.out.println(f1 + f2);
	}

	// 매개변수 2개를 전달하면서
	// 호출 할 수 있는 method
	// 단, 2개의 매개변수는 double, float 순서대로 전달되어야 한다.
	// sum(100F, 100D) 형식으로는 호출 불가능
	public void sum(double d, float fnum1) {
		// TODO Auto-generated method stub
		
	}
}
