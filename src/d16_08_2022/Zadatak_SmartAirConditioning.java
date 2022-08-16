package d16_08_2022;

public class Zadatak_SmartAirConditioning {

	public static void main(String[] args) {
		SmartAirConditioning info = new SmartAirConditioning();
		info.marka = "Samsung";
		info.izabranaTemperatura = 25;
		info.mod = "hladi";
		
		info.print();
		info.temperatura(37);

		
		SmartAirConditioning infoOKlimi = new SmartAirConditioning();
		infoOKlimi.marka = "Gree";
		infoOKlimi.izabranaTemperatura = 29;
		infoOKlimi.mod = "greje";
		
		infoOKlimi.print();
		infoOKlimi.temperatura(29);
		
	}

}
