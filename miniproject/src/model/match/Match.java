package model.match;

import model.gameboard.GameBoard;
import model.history.History;
import model.player.Player;

public class Match {
	private String id;
	private Player player1;
	private Player player2;
	private GameBoard gameBoard;
	private String startTime;
	private boolean turnPlayer = true;
	private History history;
	private int count = 0;
	
	public Match(String id, Player player1, Player player2, GameBoard gameBoard, String startTime) {
		this.id = id;
		this.player1 = player1;
		this.player2 = player2;
		this.gameBoard = gameBoard;
		this.startTime = startTime;
	}
	
	public void showMatch() {
		System.out.println("Player 1: " + this.player1.getName());
		System.out.println("Player 2: " + this.player2.getName());
		this.gameBoard.showGameBoardxxx();
		System.out.println("Score 1: " + this.player1.getScore());
		System.out.println("Score 2: " + this.player2.getScore());
	}
	
	public void playerPlay(Player player) {
		switch (player.getDirction()){
		case 1: 
			player.setScore(player.getScore()+this.gameBoard.moveGemClockwise(player.getMoveCell()));
			break;
		case 0: 
			player.setScore(player.getScore()+this.gameBoard.moveGemCounterclockwise(player.getMoveCell()));
			break;
		}
	}
	
	
	
	
	public void startMatch() {
		Player player = new Player();
		while(!gameBoard.isStopFlag()) {
			if(count%2==0) {
				setTurnPlayer(true);
				player = this.player1;
			}else {
				setTurnPlayer(false);
				player = this.player2;
			}
			if(isTurnPlayer()) {
				System.out.println("Player 1 choi: ");
			}else {
				System.out.println("Player 2 choi: ");
			}
//			player.setMoveCell(scanner.nextInt());
//			player.setDirction(scanner.nextInt());
			playerPlay(player);
			count++;
		}
		System.out.println("Ket thuc tro choi!");
		if (player1.getScore()>player2.getScore()) {
			System.out.println("Player 1 thang!");
		} else if (player1.getScore()<player2.getScore()) {
			System.out.println("Player 2 thang!");
		} else {
			System.out.println("Hoa!");
		}
	}
	
	
//	public void playerWon() {
//		if ()
//	}
	
//	public void saveHistory() {
//		if(this.gameBoard.isStopFlag()) {
//			this.history
//		}
//	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public GameBoard getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public boolean isTurnPlayer() {
		return turnPlayer;
	}

	public void setTurnPlayer(boolean turnPlayer) {
		this.turnPlayer = turnPlayer;
	}

	public History getHistory() {
		return history;
	}

	public void setHistory(History history) {
		this.history = history;
	}
	
}
