package com.soninisha;

public class AppGamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	var marioGame = new MarioGame();
		var superComntraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superComntraGame);
				gameRunner.run();
	}

}
