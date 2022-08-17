package d16_08_2022;

public class Zadatak_Proizvod {

	public static void main(String[] args) {
		Proizvod valcna = new Proizvod();
		valcna.proizvod = "Peppe Tools valcna";
		valcna.cena = "54000";
		valcna.tezina = 20000.00;
		valcna.print();
		System.out.println("Tezina valcne u tonama je " + valcna.konvertuj("t"));
		
		
		
		Proizvod nakit = new Proizvod();
		nakit.proizvod = "Noisy Plum srebrni prsten ";
		nakit.cena = "16500";
		nakit.tezina = 19.75;
		nakit.print();
		System.out.println("Tezina prstena u kilogramima je " + nakit.konvertuj("kg"));

	}

}
