package d_23_08_2022;

public class Zadatak_Racun_Transakcija {

	public static void main(String[] args) {
		Racun posiljalac = new Racun("840-15000-98", "Iva Ivic", 1000);
		Racun primalac = new Racun("840-45900-78", "Pera Peric", 800);
		Transakcija transakcija = new Transakcija("id", 1000, 800, posiljalac, primalac);
		transakcija.izvrsiTransakciju(950);
		transakcija.print();
		
		System.out.println();
		
		Racun nikola = new Racun("840-98750-34", "Nikola Petrovic", 10000);
		Racun jovan = new Racun("105-34500-23", "Jovan Ilic", 30000);
		Transakcija uplata = new Transakcija("id23", 10000, 30000, nikola, jovan);
		uplata.izvrsiTransakciju(6000);
		uplata.print();
		
	
		
		
		
		

	}

}
