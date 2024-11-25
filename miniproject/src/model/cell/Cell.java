package model.cell;

import java.util.ArrayList;

import model.gem.Gem;

public abstract class Cell {
	ArrayList<Gem> gemInCell = new ArrayList<Gem>(); 
	private int value;
	
	public int getValue() {
		return calculateValue();
	}

	public int calculateValue() {
		int v = 0;
		for (Gem gem : gemInCell) {
			v += gem.getValue();
		}
		return v;
	}
	
	public ArrayList<Gem> getGemInCell() {
		return gemInCell;
	}
	
	public void showCell() {
		System.out.println(this.getValue());
	}
}
