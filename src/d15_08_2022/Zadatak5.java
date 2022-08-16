package d15_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite n: ");
		int n = s.nextInt();
		System.out.print("Unesite karakter: ");
		String karakter = s.next();

		print(n, karakter);

	}

	public static void print(int n, String karakter) {
		for (int i = 1; i <= n; i++) {
			System.out.print(karakter);
		}

	}
	
}
