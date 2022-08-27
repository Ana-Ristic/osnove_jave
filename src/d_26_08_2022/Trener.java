package d_26_08_2022;

public class Trener extends Osoba{
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		- godine iskustva
//		- tip trenera (kondicioni, za igru, pomocni, personalni)
//		- metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o
//		treneru.
		
	private int godIskustva;
	private String tipTrenera;
	public Trener(String punoIme, String JMBG, int godRodj, int godIskustva, String tipTrenera) {
		super(punoIme, JMBG, godRodj);
		this.godIskustva = godIskustva;
		this.tipTrenera = tipTrenera;
	}
	public String getTipTrenera() {
		return tipTrenera;
	}
	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}
	public int getGodIskustva() {
		return godIskustva;
	}
	@Override
	public void print() {
		System.out.println("Ime: " + this.punoIme + ", JMBG: " +  this.JMBG + ", godina rodjenja: " + this.godRodj);
		System.out.println("Tip trenera: " + this.tipTrenera + ", " + "godine iskustva: " + this.godIskustva);
	}
	
	

}
