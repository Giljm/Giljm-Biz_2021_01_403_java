package com.callor.var;

//가
public class Var_01 {
	
	// 1
	public static void main(String args[]) {
		
		// Top(위쪽) 부분에 선언된 변수는
		// Down(아래쪽)에서 또 선언해서는 안된다.
		// 한 번 선언된 변수 이름으로
		// 또 다시 선언할 수 없다.
		int num1 = 30;
		int num2 = 40;
		int num3 = 50;
		
		/*
		 * 변수 이름 짓기
		 * 첫 글자는 영문 소문자
		 * 이후 숫자, 영문 대소문자, _ 사용할 수 있다.
		 * 두 개 이상의 단어를 조합하여 사용하는 것을 권장
		 * 두 번째 단어부터는 첫 글자를 대문자로
		 * (lower) Camel Case
		 */
		
		int korScore = 90;
		int engScore = 90;
		int mathScore = 90;
		
		// 2개 이상의 단어로 조합이 다소 불편할 때
		// 변수형 접두사로 변수의 형(Type)을 붙인다
		// 헝가리언 표기법
		int intnum1 = 20;
		int intnum2 = 30;
		int intnum3 = 40;
		float floatnum1 = 20.0F;
		float fNum2 = 30.0F;
		
		double doNum1 = 20.0;
		double doNum2 = 30.0;
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strTel = "010 - 111 - 1111";
		String strAddr = "서울특별시";
		
		/*
		 * 변수명 단어와 단어사이에 UnderScore(_)언더바
		 * 스네이크 케이스 snake case
		 * 
		 * 데이터베이스와 연동하는 프로젝트를 만들때 주로 사용하는 명명법
		 */
		
		String str_name = "이몽룡";
		
		String st_name = "이몽룡";
		String st_num = "202101001";
		
		String dept_name = "컴퓨터공학";
		
		/* 
		 * 변수 이름의 첫 글자는 영문 소문자
		 * 2개 이상의 단어를 사용하는 걸 권장, 두 번째부터 대문자를 사용
		 * 앞글자가 대문자일 경우 Uper camel case, lower camel case
		 */
		
		
	}//2
	/* 1 ~ 2의 구역을 local area, local space라고 하며
	 * main() method의 local의 area
	 * 또는 로컬스페이스라고 하며
	 * 줄여서 그냥 로컬이라고 한다. 
	 */
	
}//나
/* 가 ~ 나의 구역을
 * 클래스 Var_01의 private 영역이라고한다.
 * 또는 그냥 Var_01의 클래스의 local 영역 이라고도 한다.
 */

