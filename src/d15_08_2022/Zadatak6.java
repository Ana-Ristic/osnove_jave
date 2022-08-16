package d15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite m: ");
		int m = s.nextInt();
		System.out.print("Unesite n: ");
		int n = s.nextInt();

		izbroji(m, n);
	}

	public static void izbroji(int m, int n) {
		if (n > m) {
			int razlika = n - m - 1;
			System.out.println(razlika);
		}

		else if (m > n) {
			int razlika = m - n - 1;
			System.out.println(razlika);
		}
	}
}

