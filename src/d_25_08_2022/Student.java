package d_25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	● broj indeksa
//	● ime i prezime
//	● tip studija (osnovne, master, doktorske)
//	● niz ispita
//	● konstuktore koje mislite da ce vam trebati
//	● gettere i settere za indeks, ime i prezime, tip studija
//	● getter za niz predmeta
//	● metodu dodaj ispit u niz ispita
//	● metodu koja racuna prosek na studijama (u prosek se ubrajaju samo
//	polozeni ispiti)
//	● metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
	
	
	private String brojIndeksa;
	private String imeStudenta;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(String brojIndeksa, String imeStudenta, String tipStudija) {
		this.brojIndeksa = brojIndeksa;
		this.imeStudenta = imeStudenta;
		this.tipStudija = tipStudija;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public int prosek() {
		int suma = 0;
		int prosecnaOcena = 0;
		int petice = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if (this.ispiti.get(i).getOcena() > 5) {
				suma = suma + this.ispiti.get(i).getOcena();
			} else if (this.ispiti.get(i).getOcena() == 5) {
				petice++;
			}
			prosecnaOcena = suma / (this.ispiti.size() - petice);
		}
		return prosecnaOcena;
	}

	public void print() {
		System.out.println(this.brojIndeksa + " - " + this.imeStudenta + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < this.ispiti.size(); i++) {
			this.ispiti.get(i).print();
		}
		System.out.println("Prosecna ocena: " + this.prosek());

	}

}
