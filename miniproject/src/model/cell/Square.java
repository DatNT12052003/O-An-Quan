package model.cell;

import model.gem.SmallGem;

public class Square extends Cell{
	public Square() {
		super();
		for (int i=0; i<5; i++) {
			this.gemInCell.add(new SmallGem());
		}
	}
	
	public void showSquare() {
		System.out.println(this.gemInCell);
	}
}
