package d_26_08_2022;

import java.util.ArrayList;

public class Igrac_Karton extends Osoba_Karton{
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		- broj (broj koji igrac nosi)
//		- poziciju koju igra (odbrambeni, napadac, … )
//		- niz kartona
//		- kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		- default-ni konstuktor
//		- konstuktor sa parametrima
//		- gettere i settere za broj, kapiten i poziciju
//		- metodu dodaj karton, gde se dodaje karton u niz
//		- metodu koja vraca broj zutih kartona
//		- metodu koja vraca broj crvenih kartonas
//		- metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o
//		igracu.
	
	private int brDres;
	private String pozicija;
	private boolean kapiten;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();

	public Igrac_Karton() {
		super();
	}

	public Igrac_Karton(String punoIme, String JMBG, int godRodj, int brDres, String pozicija, boolean kapiten) {
		super(punoIme, JMBG, godRodj);
		this.brDres = brDres;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrDres() {
		return brDres;
	}

	public void setBrDres(int brDres) {
		this.brDres = brDres;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void dodajKarton(Karton k) {
		this.kartoni.add(k);
	}

	public int zutiKarton(String bojaKartona) {
		int brZutih = 0;
		for (int i = 0; i < this.kartoni.size(); i++) {
			if (this.kartoni.get(i).getKarton().equals(bojaKartona)) {
				brZutih++;
			}
		}
		return brZutih;
	}

	public int crveniKarton(String bojaKartona) {
		int brCrvenih = 0;
		for (int i = 0; i < this.kartoni.size(); i++) {
			if (this.kartoni.get(i).getKarton().equals(bojaKartona)) {
				brCrvenih++;
			}
		}
		return brCrvenih;
	}

	@Override
	public void print() {
		System.out.println("Ime: " + this.punoIme + ", JMBG: " + this.JMBG + ", godina rodjenja: " + this.godRodj);
		System.out.println("Broj: " + this.brDres + ", pozicija: " + this.pozicija);
		if (this.kapiten == true) {
			System.out.println(this.punoIme + " je kapiten.");
		} else {
			System.out.println(this.punoIme + " nije kapiten.");
		}
		System.out.println("Broj zutih kartona: " + this.zutiKarton("zuti"));
		System.out.println("Broj crvenih kartona: " + this.crveniKarton("crveni"));
	}

}
