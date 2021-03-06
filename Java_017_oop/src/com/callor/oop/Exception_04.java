package com.callor.oop;

import com.callor.oop.model.ProductVO;

public class Exception_04 {

	public static void main(String[] args) {

		ProductVO[] pVOs = new ProductVO[3];
		// 근본적으로 Exception이 발생하지 않도록 하는 코드
		pVOs[0] = new ProductVO();

		// 객체가 초기화 되지 않은 상태에서 발생하는
		// Exception을 처리하는 코드

		try {
			pVOs[0].strDName = "초코파이"; // pVOs의 strDName 이라는 곳에 문자를 넣음
		} catch (NullPointerException e) {
			System.out.println("객체가 초기화 안됨");
		}

	}
}
