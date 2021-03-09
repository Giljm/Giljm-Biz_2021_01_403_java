package com.callor.student.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	private List<StudentVO> stList;

	public StudentServiceImplV1() {

		stList = new ArrayList<StudentVO>();

	}

	@Override
	public void inputName() {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("찾는 학생 이름을 입력하세요(종료하려면 QUIT를 입력)");
			System.out.println();
			System.out.print("이름 >> ");
			String strName = scan.nextLine();

			if (strName.equals("QUIT")) {
				break;
			}

			int nSize = stList.size();

			for (int i = 0; i < nSize; i++) {
				StudentVO studentVO = stList.get(i);
				String name = studentVO.getStrName();

				if (strName.equals(name)) {
					System.out.println("\n학번 : " + studentVO.getStrNum());
					System.out.println("이름 : " + studentVO.getStrName());
					System.out.println("학과 : " + studentVO.getStrDepartment());
					System.out.println("학년 : " + studentVO.getStrLevel());
					System.out.println("반 : " + studentVO.getStrclass());
					System.out.println("주소 : " + studentVO.getStrAddress());
					System.out.println("전화번호 : " + studentVO.getStrCall() + "\n");

				}

			}
		} // end while
	}

	@Override
	public void loadStudentFile() {
		// TODO 저장된 데이터 불러오기

		String fileName = "src/com/callor/student/학생정보리스트.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();

				if (reader == null) {
					break;
				}
				String[] strStName = reader.split(":");
				StudentVO studentVO = new StudentVO(strStName[0], strStName[1], strStName[2], strStName[3],
						strStName[4], strStName[5], strStName[6]

				);

				stList.add(studentVO);

			} // end while

			buffer.close();
			fileReader.close();
			System.out.println("파일로드성공");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			System.out.println("파일 읽는 도중 오류 발생");
		}

	}

	@Override
	public void Studentprint() {
		// TODO Auto-generated method stub

	}

}
