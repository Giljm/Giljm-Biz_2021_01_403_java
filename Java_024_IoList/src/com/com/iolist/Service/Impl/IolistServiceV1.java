package com.com.iolist.Service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.com.iolist.model.IoVO;

public class IolistServiceV1 {

	private List<IoVO> ioVO;
	private String str매입매출;
	private IoVO vo;

	public IolistServiceV1() {
		ioVO = new ArrayList<IoVO>();
		str매입매출 = "src/com/com/iolist/애입매출데이터.txt";
		vo = new IoVO();
	}

	public void loadiolist() {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(str매입매출);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();

				if (reader == null) {
					break;
				}

				String ioList[] = reader.split(",");

				vo = new IoVO();
				vo.setStrdate(ioList[0]);
				vo.setStrproductName(ioList[5]);
				vo.setStrTrader(ioList[4]);
				vo.setSellPrice(Integer.valueOf(ioList[8]));
				vo.setBuyPrice(Integer.valueOf(ioList[9]));
				vo.setIntQty(Integer.valueOf(ioList[10]));

				ioVO.add(vo);

			}

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	public void total() {
		loadiolist();

		for (IoVO vo : ioVO) {

			vo.getSellPrice();

		}

	}

	public void print() {

		for (IoVO vo : ioVO)

			System.out.print(vo.getStrdate() + "\t\t" + vo.getStrTrader() + "\t\t\t" + vo.getStrproductName() + "\n");

	}

}
