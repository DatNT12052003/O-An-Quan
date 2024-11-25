package model.gem;

public class BigGem extends Gem{
	public BigGem() {
		super(10);
	}
	
	public void showGem() {
		System.out.println("Big Gem: " + this.getId());
	}
}

