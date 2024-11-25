package model.gem;

public abstract class Gem {
	private int id;
	private int value;
	private static int count = 0;
	
	public Gem(int value) {
		this.value = value;
		count++;
		this.id = count;
	}
	
	public int getValue() {
		return this.value;
	}

	public int getId() {
		return id;
	}
	
	public abstract void showGem();
	
}
