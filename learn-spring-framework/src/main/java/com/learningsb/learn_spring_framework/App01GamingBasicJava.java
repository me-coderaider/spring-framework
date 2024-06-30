package com.learningsb.learn_spring_framework;

import com.learningsb.learn_spring_framework.game.GameRunner;
import com.learningsb.learn_spring_framework.game.MarioGame;
import com.learningsb.learn_spring_framework.game.PacManGame;
import com.learningsb.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
			
		var game = new MarioGame();
//		var game = new SuperContraGame();
//		var game = new PacManGame(); // 1. Object creation
		var gameRunner = new GameRunner(game); 
		// 2. Object Creation + Wiring of Dependencies
		// GameRunner class needs a game in able to run, 
		// so, we can say game is a Dependency in general GamingConsole
		// is a dependency of GameRunner Class
		// In line 15, we're injecting dependency
		
		// now, as we're handling all this dependencies by ourself
		// let's use Spring frame to handle all of this
		
		gameRunner.run(); 
		
	}

}
