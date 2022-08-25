package d_22_08_2022;

public class Vaga {

	private String mernaJedinica;
	private Proizvod proizvod;

	public Vaga() {

	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public double sracunajCenu(double tezina) {
		if (this.mernaJedinica.equals("kg")) {
			return this.proizvod.getCenaKg() * tezina;
		} else if (this.mernaJedinica.equals("Ib")) {
			return this.proizvod.getCenaLb() * tezina;
		}
		return 0.0;
	}

	public void print(double tezina) {
		this.proizvod.print();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + " po " + this.mernaJedinica + " x " + tezina);
		} else if (this.mernaJedinica.equals("Ib")) {
			System.out.println(this.proizvod.getCenaLb() + " po " + this.mernaJedinica + " x " + tezina);
		}
		if (this.mernaJedinica.equals("kg")) {
			System.out.println("Ukupno: " + this.sracunajCenu(tezina));
		} else if (this.mernaJedinica.equals("Ib")) {
			System.out.println("Ukupno: " + this.sracunajCenu(tezina));
		}

	}

}
