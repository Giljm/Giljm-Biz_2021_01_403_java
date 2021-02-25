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
		for(int i = 0 ; i < pVOs.length ; i++) {
			pVOs[i] = new ProductVO();
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("나라쇼핑몰 상품관리 V1");
		System.out.println("========================");

		for (int i = 0; i < pVOs.length; i++) {
			System.out.print("상품명");
			pVOs[i].strPName = scan.nextLine();

			System.out.print("품목");
			pVOs[i].strItem = scan.nextLine();

			System.out.print("거래처");
			pVOs[i].strDName = scan.nextLine();

			while (true) {
				System.out.print("매입단가");
				String iPrice = scan.nextLine();
				int intPrice = Integer.valueOf(iPrice);
				if(intPrice < 0) {
					System.out.println("0 이상 입력하세요");
				} else {
					break;
				}

				
				
				System.out.print("매출단가");
				String oPrice = scan.nextLine();
				pVO[i].oPrice = Integer.valueOf(oPrice);

			}

		}

	}
}
