package d_18_08_2022;

public class SmartAirConditioning {
	public String marka;
	public int izabranaTemperatura;
	public String mod;
	public int potrosnjaHladi;
	public int potrosnjaGreje;

	public void print() {
		System.out.println(this.marka + " - " + this.mod + " - " + this.izabranaTemperatura);
	}

	public int mesecnaPotrosnja() {
		if (this.mod.equals("Hladi")) {
			return this.potrosnjaHladi * 30 * 15;
		} else if (this.mod.equals("Greje")) {
			return this.potrosnjaGreje * 30 * 15;
		} else {
			return 0;
		}
	}

	public int klimaPotrosnja() {
		return 350 * 6 + ((mesecnaPotrosnja() - 350) * 9);
	}
}

