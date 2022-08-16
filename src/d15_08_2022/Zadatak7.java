package d15_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite a: ");
		int a = s.nextInt();
		System.out.print("Unesite b: ");
		int b = s.nextInt();
		System.out.print("Unesite c: ");
		int c = s.nextInt();

		int x = najmanjiBroj(a, b, c);

		System.out.println("Najmanji broj od unetih je " + x);

	}

	public static int najmanjiBroj(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else {
			return c;
		}

	}
}
