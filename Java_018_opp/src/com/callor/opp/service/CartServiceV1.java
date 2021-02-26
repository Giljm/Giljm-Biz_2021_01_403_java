package com.callor.opp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

public class CartServiceV1 {

	Scanner scan = new Scanner(System.in);

	// 1. CartServiceV1 클래스에 cartList 객체를 인스턴스변수로 선언
	private List<CartVO> cartList = new ArrayList<CartVO>();
	private String cartUName;
	private int cartQty;
	private int cartPrice;

	// 2. inputCart() method를 선언하고
	public void inputCart() {

		System.out.println("제품명 입력");
		System.out.print("제품명 >> ");
		String strUName = scan.nextLine();

		System.out.println("수량 입력");
		System.out.print("수량 >> ");
		String strQty = scan.nextLine();
		int intQty = Integer.valueOf(strQty);

		System.out.println("가격 입력");
		System.out.print("가격 >> ");
		String strPrice = scan.nextLine();
		int intPrice = Integer.valueOf(strPrice);

	} // inputCart() method 선언

}
