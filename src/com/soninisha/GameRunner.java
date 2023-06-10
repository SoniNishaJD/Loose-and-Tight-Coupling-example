package com.soninisha;

public class GameRunner {
	SuperContraGame game;
	//MarioGame game;

//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}

	public GameRunner(SuperContraGame superComntraGame) {
		this.game = superComntraGame;
	}

	

	public void run() {
		System.out.println("Running Game" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
}
