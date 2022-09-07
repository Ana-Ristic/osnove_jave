package d_06_09_2022;

public class Tetrapak extends Ambalaza{


//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		- atribut koji kaze da li se moze reciklirati
//		- osnovna cena
//		- gettere i setter za atribute
//		- konstuktori koji su vam potrebni
//		- racuna cenu tako da ispunjava uslova:
//		- ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		- ako nije u cenu ulazi samo osnovna cena
//		- metoda stampaj stampa sve podatke iz klase tetrapak.
	
	private boolean recikliranje;
	private double osnovnaCena;
	
	
	public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean recikliranje, double osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.recikliranje = recikliranje;
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		if(recikliranje) {
			double cena = this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
			return cena;
		} else {
			double cena = this.osnovnaCena;
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
	if(recikliranje) {
		System.out.println("Ambalaza je od recikliranog materijala.");
	} else {
		System.out.println("Ambalaza nije od recikliranog materijala.");
	}
		
	}
}
