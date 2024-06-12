package com.learningsb.learn_spring_framework;

import com.learningsb.learn_spring_framework.game.GameRunner;
import com.learningsb.learn_spring_framework.game.MarioGame;
import com.learningsb.learn_spring_framework.game.PacManGame;
import com.learningsb.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
			
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run(); 
		
	}

}
