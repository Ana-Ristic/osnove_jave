package d15_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Unesite broj: ");
//		int broj = s.nextInt();

		int a = 10;
		vecaVrednost(a);
		
		int b = -65;
		vecaVrednost(b);
		
		int c = 967;
		vecaVrednost(c);

	}

	public static void vecaVrednost(int broj) {
		int vecaVrednost = broj + 10;
		System.out.println(vecaVrednost);

	}
}
