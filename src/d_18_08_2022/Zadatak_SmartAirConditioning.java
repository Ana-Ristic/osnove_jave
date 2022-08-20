package d_18_08_2022;

public class Zadatak_SmartAirConditioning {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			*metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			*metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			*metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec

		SmartAirConditioning klima = new SmartAirConditioning();
		klima.marka = "Samsung";
		klima.mod = "Greje";
		klima.izabranaTemperatura = 26;
		klima.potrosnjaGreje = 3;
		klima.potrosnjaHladi = 2;

		klima.print();
		System.out.println("Mesecna potrosnja: " + klima.mesecnaPotrosnja() + "kW/h");
		System.out.println("Klima mesecno trosi: " + klima.klimaPotrosnja() + "rsd");

	}

}
