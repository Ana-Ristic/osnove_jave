package d_25_08_2022;

public class Ispit {
//	Napisati klasu Ispit koja ima
//	● naziv predmeta
//	● ocenu (u rasponu od 5 do 10)
//	● Ime i prezime profesora koji predaje predmet
//	● konstuktore koje mislite da ce vam trebati
//	● gettere i settere za sve atribute
//	● metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do
//	10)
//	● metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)
	
	
	private String predmet;
	private int ocena;
	private String imeProfesora;
	public Ispit(int ocena, String imeProfesora) {
		this.ocena = ocena;
		this.imeProfesora = imeProfesora;
	}
	public Ispit() {

	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getImeProfesora() {
		return imeProfesora;
	}
	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}
	public boolean polozenIspit(){
		if (ocena > 5) {
			return true;
		}else {
			return false;
		}
	}
	public void print() {
		System.out.println(this.predmet + " - " + this.imeProfesora + " - " + this.ocena);
	}

}
