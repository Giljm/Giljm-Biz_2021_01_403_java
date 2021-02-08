package com.callor.start;

public class Multiple_01 {

	public static void main(String[] args) {

		int three = 0; // "three는 0이다" 를 선언.

		// "int sw = 0이다" 를 선언; sw는 100보다 작거나 같을때까지; sw++, 1을 계속 더해라.
		for (int sw = 0; sw <= 100; sw++) {

			// sw에 7을 더해서 시작해라. ex)) 7 ~ 106
			int num = sw + 7;

			boolean seven = num % 3 == 0; // = seven = (sw + 7) % 3 == 0;

			if (seven) {

				System.out.println(num);

				// 이제까지 계산할걸 누적해서 더해라, 위로 올라가서 100보다 작거나 같아 질때 까지.
				three += num;

			}
		}
		System.out.println("합 : " + three);
	}
}


/*
 * for (int i = 0 ; i <= 100 ; i++)
 * int num = i + 7
 * boolean bYes = num % 3 == 0;
 * 
 * if (bYes){
 * }
 */



