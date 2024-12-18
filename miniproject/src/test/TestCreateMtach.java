package test;

import model.gameboard.GameBoard;
import model.match.Match;
import model.player.Player;

public class TestCreateMtach {

	public static void main(String[] args) {
		Player player1 = new Player("20215028", "Dat");	
		Player player2 = new Player("20215038", "Duc");	
		
		GameBoard gameBoard = new GameBoard();
		
		Match match = new Match("123", player1, player2, gameBoard, "00:00:00");
		
		match.showMatch();
		
		int x = match.getGameBoard().moveGemClockwise(3);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		x = match.getGameBoard().moveGemCounterclockwise(10);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		x = match.getGameBoard().moveGemCounterclockwise(4);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);

		x = match.getGameBoard().moveGemClockwise(8);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		
		x = match.getGameBoard().moveGemCounterclockwise(2);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		x = match.getGameBoard().moveGemClockwise(7);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		x = match.getGameBoard().moveGemClockwise(1);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		x = match.getGameBoard().moveGemCounterclockwise(10);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		x = match.getGameBoard().moveGemCounterclockwise(3);
		System.out.println("----------------------------------");
		match.showMatch();
		System.out.println("Nhan: " + x);
		
		if(match.getGameBoard().isStopFlag()) {
			System.out.println("Tro choi da ket thuc!");
		}
	}

}
