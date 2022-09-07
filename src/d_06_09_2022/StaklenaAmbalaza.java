package d_06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

	
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	- kaucija za flasu
//	- atribut koji kaze da li se za flasu placa kaucija
//	- osnovna cena
//	- gettere i setter za atribute
//	- konstuktori koji su vam potrebni
//	- racuna cenu
//	- ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	- ako se ne placa, (osnovna cena) * 1.2
//	- metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	private double kaucija;
	private boolean placanjeKaucije;
	private double osnovnaCena;
	
	
//	public StaklenaAmbalaza() {
//		super();
//	}

//	public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto) {
//		super(barkod, naziv, neto, bruto);
//	}

	public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto, double kaucija, boolean placanjeKaucije, double osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.kaucija = kaucija;
		this.placanjeKaucije = placanjeKaucije;
		this.osnovnaCena = osnovnaCena;
	}


	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}

	@Override
	public double cena() {
		if(this.placanjeKaucije) {
			double cena = this.osnovnaCena * 1.2 + this.kaucija;
			return cena;
		} else {
			double cena = this.osnovnaCena * 1.2;
			return cena;
		}
	}

	@Override
	public void stampaj() {
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Artikal: " + this.naziv);
		System.out.println("Neto tezina " + this.neto);
		System.out.println("Bruto tezina " + this.bruto);
		System.out.println("Osnovna cena: " + this.osnovnaCena);
		System.out.println("Cena " + this.cena());
		System.out.println("Kaucija je: " + this.kaucija);
		if(this.placanjeKaucije) {
			System.out.println("Za ambalazu se placa kaucija.");
		} else {
			System.out.println("Za ambalazu se ne placa kaucija.");
		}
		
	}
}
