package test;

import java.util.Scanner;

import model.gameboard.GameBoard;
import model.match.Match;
import model.player.Player;

public class TestMatch {

	public static void main(String[] args) {
		int count = 0;
		Player player1 = new Player("20215028", "Dat");	
		Player player2 = new Player("20215038", "Duc");	
		
		GameBoard gameBoard = new GameBoard();
		
		Match match = new Match("123", player1, player2, gameBoard, "00:00:00");
		
		Scanner scanner = new Scanner(System.in);
		
		match.showMatch();
		
		while(!match.getGameBoard().isStopFlag()) {
			Player player = new Player();
			if(count%2==0) {
				match.setTurnPlayer(true);
				player = player1;
			}else {
				match.setTurnPlayer(false);
				player = player2;
			}
			if(match.isTurnPlayer()) {
				System.out.println("Player 1 choi: ");
			}else {
				System.out.println("Player 2 choi: ");
			}
			
			player.setMoveCell(scanner.nextInt());
			player.setDirction(scanner.nextInt());	
			match.playerPlay(player);
			
			match.showMatch();
			count++;
		}
		
		System.out.println("Ket thuc tro choi!");
		if (match.getPlayer1().getScore()>match.getPlayer2().getScore()) {
			System.out.println("Player 1 thang!");
		} else if (match.getPlayer1().getScore()<match.getPlayer2().getScore()) {
			System.out.println("Player 2 thang!");
		} else {
			System.out.println("Hoa!");
		}
	}

}
