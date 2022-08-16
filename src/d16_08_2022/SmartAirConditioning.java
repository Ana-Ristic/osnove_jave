package d16_08_2022;

public class SmartAirConditioning {

	public String marka;
	public int izabranaTemperatura;
	public String mod;

	public void print() {
		System.out.println("Klima " + this.marka + " " + this.mod + " i trenutna temperatura je "
				+ this.izabranaTemperatura + ".");
	}

	public void temperatura(int spoljnaTemperatura) {
		if (this.izabranaTemperatura < spoljnaTemperatura) {
			System.out.println("Temperatura napolju je visa od one na koju je postavljena klima.");
		} else if (this.izabranaTemperatura > spoljnaTemperatura) {
			System.out.println("Temperatura napolju je niza od one na koju je postavljena klima.");
		} else {
			System.out.println("Temperatura napolju je ista kao i ona na koju je postavljena klima.");
		}
	}
}
