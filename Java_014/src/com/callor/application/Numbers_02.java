package com.callor.application;

public class Numbers_02 {
	public static void main(String[] args) {

		int intNum1 = 33;
		int intNum2 = 77;

		// 1. (임시)로 사용할 inttemp를 만들고
		// 2. num1 변수값을 복사해둔다(백업)
		int inttemp = intNum1; // 33

		// 3. num1 변수에 num2의 값을 복사
		// num1 == num2 상태가 된다.
		// 77을 num1에 복사
		// num1은 77로 변경
		intNum1 = intNum2; // 77

		// 4. 임시로 temp에 백업해둔 num1의 값을
		// num1 == 77
		// temp == 33
		// num2에 복사
		// num2 == 33
		intNum2 = inttemp; // 33

		// 5. num1과 num2의 값이 서로 바뀐다.
		// 변수값의 swap 코드

//		=
//			
//		intNum1 = 77;
//		intNum2 = 33;

		System.out.printf("intNum1 : %d \nintNum2 : %d\n", intNum1, intNum2);
		
		
		
		
		
	}
}
