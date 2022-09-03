package mini_projekat;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_XOGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<XandOGame> table = new ArrayList<XandOGame>();
		Player igracX = new Player("Ivan Maric");
		Player igracO = new Player("Goran Jovic");

		XandOGame igra = new XandOGame();

		igra.startGame();
		while (igra.isGameOver()) {

			System.out.print("Unesite poziciju: ");
			int pozicija = s.nextInt();
			if (igra.isFieldFree(table, pozicija) && igra.isValidMove(pozicija)) {
				igra.makeAMove(pozicija);
				igra.print();
				igra.playNext();
			} else {
				System.out.println("You enter invalid position.");
			}
			if (igra.isWinnerX()) {
				break;
			} else if (igra.isWinnerO()) {
				break;
			}
		}
		System.out.println("Game over.");
		if (igra.isWinnerX()) {
			System.out.println("Game score: " + igracX.getPunoIme() + " - " + igra.gameScore());
		} else if (igra.isWinnerO()) {
			System.out.println("Game score: " + igracO.getPunoIme() + " - " + igra.gameScore());
		} else {
			System.out.println("Game score: " + igra.gameScore());
		}
	}
}


		
		

	
	
	
		
		

	




//if(igra.isWinnerX() == true) {
//	System.out.println("Winner: Player X!");
//} else if(igra.isWinnerO() == true) {
//	System.out.println("Winner: Player O!");
//}
