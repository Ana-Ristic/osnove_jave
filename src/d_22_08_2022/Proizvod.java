package d_22_08_2022;

public class Proizvod {
	private String sifra;
	private String naziv;
	private double cenaKg;

	public Proizvod(String sifra, String naziv, int cenaKg) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenaKg = cenaKg;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setCenaKg(int cenaKg) {
		this.cenaKg = cenaKg;
	}

	public double getCenaKg() {
		return this.cenaKg;
	}

	public double getCenaLb() {
		return this.cenaKg * 2.2046;
	}

	public void print() {
		System.out.println(this.sifra + " - " + this.naziv);
	}

}
