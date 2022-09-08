package d_06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
//	Kreirati klasu PlaninarskiDom koja ima privatne atribute:
//		● naziv doma
//		● godinu kada je osnovan.
//		● članove doma koji su planinari (klasa vodi računa o nizu)
//		Dok od javnih:
//		● default-ni konstuktor i konstuktor koji postavlja sve parametre
//		● gettere i settere koji su potrebni
//		● metodu učlani planinara, koja dodaje planinara u niz
//		● metodu koja vraća broj planinara koji će se uspešno popeti na planinu (metoda za
//		parametar prima Planinu za koju se proverava informacija)
//		● metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//		● metodu koja štampa podatke o domu i o svim članovima doma
//		● metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
	
	private String naziv;
	private int godOsnivanja;
	private ArrayList<Planinar> clanovi = new ArrayList<Planinar>();

	public PlaninarskiDom() {

	}

	public PlaninarskiDom(String naziv, int godOsnivanja) {
		super();
		this.naziv = naziv;
		this.godOsnivanja = godOsnivanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}

	public void uclaniPlaninara(Planinar planinar) {
		this.clanovi.add(planinar);
	}

	public int brUspesnihUspona(Planina visina) {
		int broj = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			if (this.clanovi.get(i).uspesanUspon(visina)) {
				broj++;
			}
		}
		return this.clanovi.size() - broj;

	}

	public void izbaciPlaninara(String id) {
		for (int i = 0; i < this.clanovi.size(); i++) {
			if (this.clanovi.get(i).getId().equals(id)) {
				this.clanovi.remove(i);
			}
		}

	}

	public void stampaj() {
		System.out.println("Planinarski dom: " + this.naziv);
		System.out.println("Godina osnivanja: " + this.godOsnivanja);
		System.out.print("Clanovi planinarskog drustva su: ");
		for (int i = 0; i < this.clanovi.size(); i++) {
			System.out.print(this.clanovi.get(i).punoIme + ", ");
		}

	}

	public int mesecniPrihod() {
		int suma = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			suma = suma + this.clanovi.get(i).clanarina();
		}
		return suma;
	}

}
