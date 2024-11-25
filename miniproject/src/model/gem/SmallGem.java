package model.gem;

public class SmallGem extends Gem{
	public SmallGem() {
		super(1);
	}
	
	public void showGem() {
		System.out.println("Small Gem: " + this.getId());
	}
}
