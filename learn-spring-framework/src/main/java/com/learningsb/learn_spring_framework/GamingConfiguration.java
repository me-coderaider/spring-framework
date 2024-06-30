package com.learningsb.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learningsb.learn_spring_framework.game.GameRunner;
import com.learningsb.learn_spring_framework.game.GamingConsole;
import com.learningsb.learn_spring_framework.game.MarioGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}
}
