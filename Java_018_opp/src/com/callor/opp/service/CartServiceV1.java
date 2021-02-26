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
		setCartUName(strUName);

		System.out.println("수량 입력");
		System.out.print("수량 >> ");
		String strQty = scan.nextLine();
		int intQty = Integer.valueOf(strQty);
		setCartQty(intQty);

		System.out.println("가격 입력");
		System.out.print("가격 >> ");
		String strPrice = scan.nextLine();
		int intPrice = Integer.valueOf(strPrice);
		setCartPrice(intPrice);
		
		

	} // inputCart() method 선언

	public String getCartUName() {
		return cartUName;
	}

	public void setCartUName(String cartUName) {
		this.cartUName = cartUName;
	}

	public int getCartQty() {
		return cartQty;
	}

	public void setCartQty(int cartQty) {
		this.cartQty = cartQty;
	}

	public int getCartPrice() {
		return cartPrice;
	}

	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}

}
