package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_01 {

	public static void main(String[] args) {

		ProductVO pVO = new ProductVO();
		
		System.out.println("toString() : " + pVO.toString());
		
		Scanner scan = new Scanner(System.in);

		System.out.println("==============================");
		System.out.println("상품정보 등록(입력) 시스템 V1");
		System.out.println("------------------------------");
		System.out.println("상품정보를 입력하세요");
		System.out.println("------------------------------");

		System.out.print("상품 코드 >> ");
		String strPCode = scan.nextLine();

		pVO.strPCode = strPCode;

		System.out.print("상품명(이름) >> ");
		String strPName = scan.nextLine();

		pVO.strPName = strPName;

		System.out.print("품목 >> ");
		String strItem = scan.nextLine();

		pVO.strItem = strItem;

		System.out.print("거래처 >> ");
		String strDName = scan.nextLine();

		pVO.strDName = strDName;

		System.out.print("매입단가 >> ");
		int iPrice = scan.nextInt();

		pVO.iPrice = iPrice;

		System.out.print("매출단가 >> ");
		int oPrice = scan.nextInt();

		pVO.oPrice = oPrice;
		
		pVO.toString();
		
		
		
	}

}
