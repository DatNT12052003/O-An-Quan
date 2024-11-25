package model.cell;

import model.gem.BigGem;

public class SemiCircle extends Cell{
	public SemiCircle() {
		super();
		this.gemInCell.add(new BigGem());
	}
	
	public void showSemiCircle() {
		System.out.println(this.gemInCell);
	}
}
