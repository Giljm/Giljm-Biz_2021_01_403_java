package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_03 {

	public static void main(String[] args) {

		// VO 클래스를 배열로 선언하고
		// 사용(데이터 저장, 읽기)하려면
		// 선언된 객체배열 요소요소를 모두
		// 다시 초기화(생성)하는 과정이 필요하다
		// 이 과정이 생략되면
		// 이후 코드에서 NullPointerException이 발생한다

		ProductVO[] pVOs = new ProductVO[5];
		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}

		Scanner scan = new Scanner(System.in);

		System.out.println("=========================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("========================");

		String strN = 3 + ""; // "3" 이라는 문자열로 저장
		int intN = Integer.valueOf(strN);

		for (int i = 0; i < pVOs.length; i++) {

			// 연속된 값으로 상품코드 생성
			String pCode = (i + 1) + "";
			pVOs[i].strPCode = pCode;

			System.out.print("상품명 >> ");
			pVOs[i].strPName = scan.nextLine();

			System.out.print("품목 >> ");
			pVOs[i].strItem = scan.nextLine();

			System.out.print("거래처 >> ");
			pVOs[i].strDName = scan.nextLine();

			while (true) {
				System.out.print("매입단가 >> ");
				String iPrice = scan.nextLine();
				int intPrice = Integer.valueOf(iPrice);
				if (intPrice < 0) {
					System.out.println("0 이상 입력하세요");
				} else {
					pVOs[i].iPrice = intPrice;
					break;
				}

			} // while end

			while (true) {
				System.out.print("매출단가 >> ");
				String oPrice = scan.nextLine();
				int intOPrice = Integer.valueOf(oPrice);
				if (intOPrice < 0) {
					System.out.println("0 이상 입력하세요");
				} else {
					// 정상처리되었으면
					// 단가가 0 이상 입력되었으면
					// VO에 값을 저장하고
					// 다음단계로 진행
					//  현 시점의 while()은 중단하라
					pVOs[i].oPrice = intOPrice;
					break;
				}

			} // while end
			
		}

	}
}
