package d_26_08_2022;

public class Zadatak_Igrac_Trener {
	
	

	public static void main(String[] args) {
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		
		
		Igrac igrac = new Igrac("Ivan Maric", "2503982345047", 1982, 12, "bek", true  );
		igrac.print();
		
		Igrac igrac1 = new Igrac("Marko Savic","0204999345876", 1999, 03, "golman", false);
		igrac1.print();
		
		Trener trener = new Trener("Svetozar Pesic", " 1209956238651", 1956, 35, "kondicioni");
		trener.print();
		
		Trener trener1 = new Trener("Sava Ivkovic", " 2910966267295", 1966, 24, "pomocni");
		trener1.print();

	
		
		
			
		} 
		
	}


