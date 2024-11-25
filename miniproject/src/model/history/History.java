package model.history;

public class History {
	private String id;
	private String startTime;
	private String namePlayer1;
	private String namePlayer2;
	private int scorePlayer1;
	private int scorePlayer2;
	private String winner;
	
	public void show() {
		System.out.println("ID = " + this.id);
		System.out.println("Start time: " +  this.startTime);
		System.out.println("Player 1: " + this.namePlayer1);
		System.out.println("Player 2: " + this.namePlayer2);
		System.out.println("Score player1: " + this.scorePlayer1);
		System.out.println("Score player1: " + this.scorePlayer2);
		System.out.println("Winner =  " + this.winner);
	}
	
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getNamePlayer1() {
		return namePlayer1;
	}
	public void setNamePlayer1(String namePlayer1) {
		this.namePlayer1 = namePlayer1;
	}
	public String getNamePlayer2() {
		return namePlayer2;
	}
	public void setNamePlayer2(String namePlayer2) {
		this.namePlayer2 = namePlayer2;
	}
	public int getScorePlayer1() {
		return scorePlayer1;
	}
	public void setScorePlayer1(int scorePlayer1) {
		this.scorePlayer1 = scorePlayer1;
	}
	public int getScorePlayer2() {
		return scorePlayer2;
	}
	public void setScorePlayer2(int scorePlayer2) {
		this.scorePlayer2 = scorePlayer2;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	
	
}
