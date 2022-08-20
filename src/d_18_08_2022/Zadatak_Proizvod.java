package d_18_08_2022;

public class Zadatak_Proizvod {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, 
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//		Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
		
		
		
		Proizvod ogrlica = new Proizvod();
		ogrlica.naziv = "Srebrna ogrlica";
		ogrlica.cena = 9700.00;
		ogrlica.tezinaUg = 150.00;

		ogrlica.print();
		System.out.println();
		ogrlica.povecajCenu(79.00);
		System.out.println("Cena sa uracunatim popustom je " + ogrlica.vratiCenuSaPopustom(300) + " rsd.");
		System.out.println("Postarina je " + ogrlica.racunajPostarinu() + (" rsd."));

		System.out.println();

		Proizvod mikroMotor = new Proizvod();
		mikroMotor.naziv = "Foredome Pendant Motor SR";
		mikroMotor.cena = 64600.00;
		mikroMotor.tezinaUg = 1350.00;

		mikroMotor.print();
		System.out.println();
		mikroMotor.povecajCenu(9450.00);
		System.out.println("Cena sa uracunatim popustom je " + mikroMotor.vratiCenuSaPopustom(4500) + " rsd.");
		System.out.println("Postarina je " + mikroMotor.racunajPostarinu() + " rsd.");

	}

}
