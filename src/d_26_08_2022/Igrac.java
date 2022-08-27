package d_26_08_2022;

public class Igrac extends Osoba{
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		- broj (broj koji igrac nosi)
//		- poziciju koju igra (odbrambeni, napadac, … )
//		- kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		- default-ni konstuktor
//		- konstuktor sa parametrima
//		- gettere i settere za broj, kapiten i poziciju
//		- metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o
//		igracu
	
	
	private int brDres;
	private String pozicija;
	private boolean kapiten;
	public Igrac() {
		super();
	}
	public Igrac(String punoIme, String JMBG, int godRodj, int brDres, String pozicija, boolean kapiten) {
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
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	@Override
	public void print() {
		System.out.println("Ime: " + this.punoIme + ", JMBG: " +  this.JMBG + ", godina rodjenja: " + this.godRodj);
		System.out.println("Broj: " + this.brDres + ", pozicija: " + this.pozicija);
		if(this.kapiten == true) {
			System.out.println(this.punoIme + " je kapiten.");
		} else {
			System.out.println(this.punoIme + " nije kapiten.");
		}
	}
	

}
