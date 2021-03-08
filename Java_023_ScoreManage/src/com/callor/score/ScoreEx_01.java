package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceV1;
import com.callor.score.service.impl.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreService sService = new ScoreServiceV1();
		MenuService mService = new MenuServiceV1();
		
		while (true) {

			Integer menu = mService.selectMenu();

			if (menu == null) {
				break;
			} else if (menu == 1) {
				sService.makeScore();
			} else if (menu == 2) {
				sService.saveScoreToFile();
			} else if (menu == 3) {
				sService.loadScoreFromFile();
			}
		}
	}
}
