package d_18_08_2022;

public class Proizvod {

	public String naziv;
	public double cena;
	public double tezinaUg;

	public void print() {
		System.out.print("{{" + this.naziv + "}}, " + "{{" + this.cena + "}}, " + "{{" + this.tezinaUg + "}}");
	}

	public void povecajCenu(double povecanje) {
		this.cena = this.cena + povecanje;
	}

	public double vratiCenuSaPopustom(int popust) {
		return this.cena - popust;
	}

	public int racunajPostarinu() {
		if (tezinaUg <= 100) {
			return 200;
		} else if (tezinaUg < 500) {
			return 400;
		} else {
			return 1000;
		}
	}
}
