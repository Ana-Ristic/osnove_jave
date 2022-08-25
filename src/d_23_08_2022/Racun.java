package d_23_08_2022;

public class Racun {
	private String brojRacina;
	private String punoIme;
	private double trenutnoStanje;
	public Racun(String brojRacina, String punoIme, double trenutnoStanje) {
		super();
		this.brojRacina = brojRacina;
		this.punoIme = punoIme;
		this.trenutnoStanje = trenutnoStanje;
	}
	public String getBrojRacina() {
		return brojRacina;
	}
	public void setBrojRacina(String brojRacina) {
		this.brojRacina = brojRacina;
	}
	public String getPunoIme() {
		return punoIme;
	}
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	public double stanjeNaRacunu(int vrednost) {
		if (this.trenutnoStanje >= vrednost) {
			return this.trenutnoStanje - vrednost;
		} else {
			return 0.0;
		}
	}
	
	public void print() {
		System.out.println(this.punoIme + " - " + this.brojRacina);
		System.out.println("Stanje na racunu je " + this.trenutnoStanje + " rsd.");
	}
	
	
}
