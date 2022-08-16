package d16_08_2022;

public class Proizvod {
	public String proizvod;
	public String cena;
	public double tezina;

	public void print() {
		System.out.println("{{" + this.proizvod + "}}," + "{{" + this.cena + "}}," + "{{" + this.tezina + "}}");
	}

	public double konvertuj(String jedinicaTezine) {

		if (jedinicaTezine.equals("kg")) {
			double kg = this.tezina / 1000;
			return kg;
		} else if (jedinicaTezine.equals("t")) {
			double t = this.tezina / 1000000;
			return t;
		}
		return 0;

	}
}