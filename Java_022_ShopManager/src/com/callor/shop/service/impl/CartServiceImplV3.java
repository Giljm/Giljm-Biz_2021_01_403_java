package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;

public class CartServiceImplV3 extends CartServiceImplV1 implements CartServiceV2{
	
	List<CartVO> cartList;
	private Scanner scan;
	private String cartFileName;
	
	public CartServiceImplV3() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
		cartFileName = "src/com/callor/shop/cartList.csv";
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void saveCartToFile() {
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(cartFileName);
			printer = new PrintWriter(fileWriter);
			
//			printer.println("대한민국");
//			printer.println("우리나라");
//			printer.println("Republic of Korea");
			
			printer.close();
			fileWriter.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadCartFromFile() {
		// TODO Auto-generated method stub
		
	}

}
