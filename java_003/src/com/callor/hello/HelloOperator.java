package com.callor.hello;

/*
 *  클래스 이름 짓기
 *  1. 명명규칙
 *  	첫 글자는 영문 대문자
 *  	이후에는 영문 대 소 문자, 숫자 Under Score(_)
 *  
 *  2. 명명패턴
 *  	Camel Case로 이름 짓기
 *  	가급적 2단어 이상으로 조합하여 짓자
 *  	각 단어가 시작될때는 대문자로 시작
 *  	숫자, UnderScore는 가급적 사용을 자제하자
 *  	클래스 이름만 보고 하는 일을 유추하도록 하자
 */

public class HelloOperator {
	
	public static void main(String main[]) {
	
		System.out.println( 30 + 40 );
		System.out.println( 30 * 40 );
		System.out.println( 40 - 30 );
		System.out.println( 40. / 30. );
		System.out.println( 40 % 30 );
		
	}

}
