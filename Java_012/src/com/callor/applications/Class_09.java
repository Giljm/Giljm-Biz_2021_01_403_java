package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.ServiceV1.ClassServiceV7;

public class Class_09 {

	public static void main(String[] args) {

		ClassServiceV7 csV7 = new ClassServiceV7();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2 ~ 9 사이의 숫자 입력");
		int dan = scan.nextInt();

		csV7.GuGu(dan);

	}
}
