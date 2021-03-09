package com.callor.iolist;

import com.callor.iolist.Service.IolistService;
import com.callor.iolist.Service.impl.iolistSerivceV1;

public class IolistEx_01 {

	public static void main(String[] args) {

		IolistService iolistService = new iolistSerivceV1();
		
		iolistService.loadDataFromFile();
		iolistService.ioListSum();
		iolistService.printIoList();

	}

}
