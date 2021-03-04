package com.callor.shop.service;

public interface CartServiceV2 extends CartService{
	// 인터페이스는 인터페이스만 상속 받을 수 있다.
	
	public void saveCartToFile();
	public void loadCartFromFile();

}
