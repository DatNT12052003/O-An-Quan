package model.gameboard;

import model.cell.Cell;
import model.cell.SemiCircle;
import model.cell.Square;
import model.gem.Gem;

public class GameBoard {
	private Cell[] gameboard = new Cell[12];
	private boolean stopFlag = false;
	
	public GameBoard() {
		for(int i=0; i<12; i++) {
			if(i%6==0) {
				this.gameboard[i] = new SemiCircle();
			} else {
				this.gameboard[i] = new Square();
			}
		}
	}
	
	public void showGameBoardxxx() {
		for (int i=0; i<12;i++) {
			this.gameboard[i].showCell();
		}
	}
	
	//di chuyen cung kim dong ho
	private int moveGemClockwise1Cell(int i) {
		int j = 1;
		for (Gem gem : this.gameboard[i].getGemInCell()) {
			this.gameboard[(i+j)%12].getGemInCell().add(gem);
			j++;
		}
		this.gameboard[i].getGemInCell().clear();
		return (i+j)%12;
	}

	public int moveGemClockwise(int index) {
		int k = this.moveGemClockwise1Cell(index);
		while (this.gameboard[k].getGemInCell().size() != 0) {
			if ((k==0)||(k==6)) {
				return 0;
			}else {
				k = this.moveGemClockwise1Cell(k);
			}
		}
		int score = 0;
		while(this.gameboard[k].getGemInCell().size()==0) {
			if ((this.gameboard[(k+1)%12].getGemInCell().size()!=0)) {
				score = score + this.gameboard[(k+1)%12].getValue();
				this.gameboard[(k+1)%12].getGemInCell().clear();
				if((this.gameboard[0].getValue()==0)&&(this.gameboard[6].getValue()==0)) {
					this.stopFlag = true;
				}
			} else break;
			k=(k+2)%12;
		}
		return score;
	}
	
	//di chuyen nguoc kim dong ho
	private int moveGemCounterclockwise1Cell(int i) {
		int j = 1;
		for (Gem gem : this.gameboard[i].getGemInCell()) {
			this.gameboard[(12+i-j)%12].getGemInCell().add(gem);
			j++;
		}
		this.gameboard[i].getGemInCell().clear();
		return (12+i-j)%12;
	}
	
	public int moveGemCounterclockwise(int index) {
		int k = this.moveGemCounterclockwise1Cell(index);
		while (this.gameboard[k].getGemInCell().size() != 0) {
			if ((k==0)||(k==6)) {
				return 0;
			}else {
				k = this.moveGemCounterclockwise1Cell(k);
			}
		}
		int score = 0;
		while(this.gameboard[k].getGemInCell().size()==0) {
			if ((this.gameboard[(k-1)%12].getGemInCell().size()!=0)) {
				score = score + this.gameboard[(k-1)%12].getValue();
				this.gameboard[(k-1)%12].getGemInCell().clear();
				if((this.gameboard[0].getValue()==0)&&(this.gameboard[6].getValue()==0)) {
					this.stopFlag = true;
				}
			} else break;
			k=(12+k-2)%12;
		}
		return score;
	}
	
	public boolean isStopFlag() {
		return stopFlag;
	}

	public void setStopFlag(boolean stopFlag) {
		this.stopFlag = stopFlag;
	}
	
}
