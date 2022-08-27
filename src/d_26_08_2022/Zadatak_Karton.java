package d_26_08_2022;

public class Zadatak_Karton {

	public static void main(String[] args) {
		// U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

		Karton k = new Karton("zuti");
		Karton k1 = new Karton("zuti");
		Karton k2 = new Karton("zuti");
		Karton k3 = new Karton("crveni");
		Karton k4 = new Karton("zuti");
		Karton k5 = new Karton("crveni");

		Igrac_Karton igrac = new Igrac_Karton("Ivan Maric", "2503982345047", 1982, 12, "bek", true);

		igrac.dodajKarton(k);
		igrac.dodajKarton(k3);
		igrac.dodajKarton(k2);
		igrac.dodajKarton(k1);
		igrac.dodajKarton(k5);
		igrac.dodajKarton(k4);
		igrac.print();

	}

}
