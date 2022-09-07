package d_06_09_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//		- broj kartice
//		- ime i prezime vlasnika
//		- popust (200, 500, … )
//		- konstuktore (default-ni i sa parametrima)
//		- gettere i settere
//		- metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
	
	private String brKarice;
	private String imeVlasnika;
	private double popust;
//	public SuperKartica() {
//		
//	}
	
	public SuperKartica(String brKarice, String imeVlasnika, double popust) {
		super();
		this.brKarice = brKarice;
		this.imeVlasnika = imeVlasnika;
		this.popust = popust;
	}

	public String getBrKarice() {
		return brKarice;
	}

	public void setBrKarice(String brKarice) {
		this.brKarice = brKarice;
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	public void stampaj() {
		System.out.println(this.brKarice + ", " + this.imeVlasnika);
	}
	

}
