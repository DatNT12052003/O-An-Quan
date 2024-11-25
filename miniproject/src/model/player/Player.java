package model.player;

public class Player {
	private String id;
	private String name;
	private int moveCell;
	private int dirction;
	private int score = 0;

	public Player(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Player() {
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoveCell() {
		return moveCell;
	}

	public void setMoveCell(int moveCell) {
		this.moveCell = moveCell;
	}

	public int getDirction() {
		return dirction;
	}

	public void setDirction(int dirction) {
		this.dirction = dirction;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
