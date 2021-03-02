package com.callor.opp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.opp.model.CartVO;

/*
 * Service 클래스
 * main() method에서 구현한 코드들을
 * 별도의 클래스로 분리하고
 * 작은 method 단위로 코드를 작성하여
 * 전체적으로 단위코드가 작아지도록 하기 위한 기법
 * 이후에 유지보스 (업그레이드, 오류정정)를 유리하게 하기 위한 방법
 */


public class CartServiceV1 {

	/*
	 * Scanner, File, Network 이러한 클래스들은
	 * 운영체와 연동하여 컴퓨터 자체의 자원(Resouce)을 사용하게 된다.
	 * 컴퓨터 자체의 자원(Resouce)은 유한하다
	 * 때문에 자원은 무턱대고 열고 사용만 해서는 안됀다.
	 * 자원 사용하기 위해서 선언을 한 후
	 * 사용이 끝나면 반드시 반납(close)해 줘야한다
	 * 그래야먄 application이 실행되는 과정에서 자원의 누수(leak)가 발생하지 않는다.
	 * 
	 * 여기 inputCart() method 는
	 * 사용방법에 따라서 수회 반복적으로 호출이 될 것이다
	 * 수회 반복적으로 호출되는 동안에
	 * Scanner 가 열리고 닫히는 과정이 계속 반복된다.
	 * Resouce 를 열고 닫는 과정은 실제 컴퓨터 운영체제 어플리케이션 입장에서는
	 * 상당히 많은은 일을 수행해야한다.
	 * 
	 * 이러한 과정은 어플리케이션의 성능을 저하시키는 중대한 원인이 될 수 있다.
	 * 
	 * 그래서 scanner를 method 내부에서 선언하지 않고
	 * 클래스의 인스턴스 영역으로 보낸다.
	 * 
	 * 계속 사용할 키보드 입력을 처리할 스캐너를
	 * 인스턴스 영역으로 이동했다.
	 * 인스턴스 영역에 선언된 객체들은 특별한 경우가 아니면 private로 일단 선언
	 * 
	 * 
	 * 
	 */
	
	Scanner scan = new Scanner(System.in);

	private List<CartVO> cartList = new ArrayList<CartVO>();
	private CartVO cartVO;
	
	/*
	 * 사용자로 부터 키보드로 상품정보를 입력받아
	 * 카트 리스트에 추가코드
	 */
	
	public void inputCart() {

		System.out.println("제품 정보를 입력하세요");
		System.out.println("----------------------");

		cartVO = new CartVO();

		System.out.println("제품명 입력");
		System.out.print("제품명 >> ");
		String strPName = scan.nextLine();

		int intQty = 0;
		while (true) {
			System.out.println("수량 입력");
			System.out.print("수량 >> ");
			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);
				if (intQty < 2) {
					System.out.println("수량은 2개 이상만 입력하세요!");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("수량에는 숫자만 입력하세요!");
			} // end catch
		} // end while

		int intPrice = 0;
		while (true) {
			System.out.println("가격 입력");
			System.out.print("가격 >> ");
			String strPrice = scan.nextLine();
			try {
				intPrice = Integer.valueOf(strPrice);
				if (intPrice < 1000) {
					System.out.println("가격은 1000원 이상만 입력하세요.");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("가격에는 숫자만 입력하세요!");
			} // end catch
		} // end while

		cartVO.setCartPName(strPName);
		cartVO.setCartQty(intQty);
		cartVO.setCartPrice(intPrice);

		cartList.add(cartVO);
	} // end inputCart() method

	public void printcartList() {
		int size = cartList.size();
		for (int i = 0; i < size; i++) {
			System.out.println("제품명\t수량\t가격\t");
			System.out.printf("%s\t", cartList.get(i).getCartPName());
			System.out.printf("%d개\t", cartList.get(i).getCartQty());
			System.out.printf("%d원\t", cartList.get(i).getCartPrice());

		} // end for
	} // end printcartList() method
}