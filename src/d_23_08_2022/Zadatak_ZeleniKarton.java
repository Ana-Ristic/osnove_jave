package d_23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_ZeleniKarton {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton> indeks = new ArrayList<ZeleniKarton>();

		for (int i = 0; i < 10; i++) {
			System.out.print("Ime studenta: ");
			String imeStudenta = s.next();

			System.out.print("Prezime studenta: ");
			String prezimeStudenta = s.next();

			System.out.print("Broj indeksa: ");
			String brojIndeksa = s.next();

			System.out.print("Naziv predmeta: ");
			String predmet = s.next();

			System.out.print("Ime profesora: ");
			String imeProfesora = s.next();

			System.out.print("Prezime profesora: ");
			String prezimeProfesora = s.next();

			System.out.print("Ocena: ");
			int ocena = s.nextInt();

			ZeleniKarton zKarton = new ZeleniKarton(imeStudenta, prezimeStudenta, brojIndeksa, predmet, imeProfesora,
					prezimeProfesora, ocena);
			indeks.add(zKarton);
		}

		for (int i = 0; i <= indeks.size() - 1; i++) {
			System.out.println("Student: " + indeks.get(i).getImeStudenta() + " " + indeks.get(i).getPrezimeStudenta()
					+ " - " + "Broj indeksa: " + indeks.get(i).getBrojIndeksa());
			System.out.println("predmet: " + indeks.get(i).getPredmet() + " - " + "Ocena: " + indeks.get(i).getOcena());
			System.out.println(
					"Profesor: " + indeks.get(i).getImeProfesora() + " " + indeks.get(i).getPrezimeProfesora());

		}

		int prosecnaOcena = 0;
		int suma = 0;
		for (int i = 0; i <= indeks.size() - 1; i++) {
			suma = suma + indeks.get(i).getOcena();
			prosecnaOcena = suma / indeks.size();
		}
		System.out.println("Prosecna ocena je " + prosecnaOcena);

		int suma1 = 0;
		for (int i = 0; i <= indeks.size() - 1; i++) {
			if (indeks.get(i).getOcena() > 5)
				suma1 = suma1 + indeks.get(i).getOcena();
			prosecnaOcena = suma1 / indeks.size();
		}
		System.out.println("Prosecna ocena je " + prosecnaOcena);
	}
}
	


