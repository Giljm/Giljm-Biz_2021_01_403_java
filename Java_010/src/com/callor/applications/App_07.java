package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

import com.callor.applications.myclass.MyGuGuDan;

public class App_07 {
	public static void main(String[] args) {
		MyGuGuDan myGu = new MyGuGuDan();
		/*
		 * MyGuGuDan 클래스에 정의된 print() method 호출
		 * MyGuGuDan 클래스의 print() method 호출
		 * 
		 * int => 정수
		 * 
		 * print(int) ... arguments ();
		 * =>
		 * arguments (); : 괄호안에 값을 넣어라.
		 * 
		 */
		myGu.print(555); // 정수 하나를 선언해야 명령을 실행. 
		
		Random rnd = new Random();
		//Random 클래스의
		// nextInt() method를 호출하라
		rnd.nextInt(10); // 랜덤 클래스에 있는 nextInt() method를 호출하라
		// rnd.nextInt(0);
		
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		
		Random rd = new Random();
		rd. nextInt(100);

	}
}
