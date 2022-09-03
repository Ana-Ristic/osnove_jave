package mini_projekat;

import java.util.ArrayList;

public class XandOGame extends Player {
	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private String playerX;
	private String playerO;

	public XandOGame() {
		super();
		for (int i = 0; i < 9; i++) {
			String element = " ";
			table.add(element);
		}
	}

	public XandOGame(String playerX, String playerO) {
		super();
		this.playerX = playerX;
		this.playerO = playerO;
	}

	public ArrayList<String> getTable() {
		return table;
	}

	public String getPlayerX() {
		return playerX;
	}

	public void setPlayerX(String playerX) {
		this.playerX = playerX;
	}

	public String getPlayerO() {
		return playerO;
	}

	public void setPlayerO(String playerO) {
		this.playerO = playerO;
	}

	public String getNextPlayer() {
		return nextPlayer;
	}

	public void print() {
		for (int i = 0; i < this.table.size(); i++) {
			System.out.print(this.table.get(i) + "|");
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}

	public void startGame() {
		for (int i = 0; i < this.table.size(); i++) {
			this.table.set(i, " ");
			this.nextPlayer = "x";
		}
		System.out.println("Start game.");
	}

	public boolean isGameOver() {
		for (int i = 0; i < this.table.size(); i++) {
			if (this.table.get(i) == " ")
				return true;
		}
		return false;
	}

	public boolean isFieldFree(ArrayList<XandOGame> table, int pozicija) {
		for (int i = 0; i < this.table.size(); i++) {
			if (this.table.get(pozicija) != "x" && this.table.get(pozicija) != "o")
				return true;
		}
		return false;
	}

	public void playNext() {
		if (this.nextPlayer == "x") {
			this.nextPlayer = "o";
		} else if (this.nextPlayer == "o") {
			this.nextPlayer = "x";
		}
	}

	public void makeAMove(int pozicija) {
		this.table.set(pozicija, this.nextPlayer);
	}

	public boolean isWinnerX() {
		if (this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")) {
			return true;
		} else if (this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")) {
			return true;
		} else if (this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")) {
			return true;
		} else if (this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")) {
			return true;
		} else if (this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")) {
			return true;
		} else if (this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")) {
			return true;
		} else if (this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")) {
			return true;
		} else if (this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		}
		return false;
	}

	public boolean isWinnerO() {
		if (this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")) {
			return true;
		} else if (this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")) {
			return true;
		} else if (this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")) {
			return true;
		} else if (this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")) {
			return true;
		} else if (this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")) {
			return true;
		} else if (this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")) {
			return true;
		} else if (this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")) {
			return true;
		} else if (this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) {
			return true;
		}
		return false;
	}

	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 || pozicija <= 8) {
			return true;
		} else
			return false;
	}

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}

}
	
	
	
	
	
	
	
	
	
	
	

