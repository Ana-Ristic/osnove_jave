package d_06_09_2022;

public class Zadatak_Ambalaza {

	public static void main(String[] args) {
//		U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i
//		istestirati sve metode i ispisati ukupnu cenu sa popustom.
		
		Korpa korpa = new Korpa();
		Ambalaza staklo = new StaklenaAmbalaza("6789", "Voda", 34.0, 56.0, 20.0, false, 100.0);
		Ambalaza tetrapak = new Tetrapak("6849", "Mleko", 70, 100, true, 130);
		Ambalaza staklo1= new StaklenaAmbalaza("3451", "Fanta", 60, 80, 30, true, 200);
		korpa.dodajAmbalazu(staklo);
		korpa.dodajAmbalazu(tetrapak);
		korpa.dodajAmbalazu(staklo1);
		
		SuperKartica superkartica = new SuperKartica("789-98", "Jovan Misic", 150);
		
		korpa.cenaKorpe(superkartica);
		korpa.izbaciAmbalazu("6789");
		staklo.stampaj();
		tetrapak.stampaj();
		

	}

}
