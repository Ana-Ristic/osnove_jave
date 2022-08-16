package d15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite a: ");
		int a = s.nextInt();
		System.out.print("Unesite b: ");
		int b = s.nextInt();
		int vrednost = novaVrednost(a, b);
		System.out.println(vrednost);

	}

	public static int novaVrednost(int a, int b) {
		int novaVrednost = a * 10 + b;
		return novaVrednost;

	}
}
