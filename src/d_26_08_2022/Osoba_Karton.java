package d_26_08_2022;

public class Osoba_Karton {
//	Kreirati klasu Osoba koja ima:
//		- ime i prezime
//		- jmbg
//		- godinu rodjenja
//		- default-ni konstuktor
//		- konstuktor sa parametrima
//		- gettere i settere
//		- metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
	
	protected String punoIme;
	protected String JMBG;
	protected int godRodj;

	public Osoba_Karton() {
		super();
	}

	public Osoba_Karton(String punoIme, String JMBG, int godRodj) {
		super();
		this.punoIme = punoIme;
		this.JMBG = JMBG;
		this.godRodj = godRodj;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJMBG() {
		return JMBG;
	}

	public void setJMBG(String jMBG) {
		JMBG = jMBG;
	}

	public int getGodRodj() {
		return godRodj;
	}

	public void setGodRodj(int godRodj) {
		this.godRodj = godRodj;
	}

	public void print() {
		System.out.println("Ime: " + this.punoIme + ", JMBG: " + this.JMBG + ", godina rodjenja: " + this.godRodj);
	}

}
