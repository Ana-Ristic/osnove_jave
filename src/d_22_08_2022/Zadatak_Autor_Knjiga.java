package d_22_08_2022;

public class Zadatak_Autor_Knjiga {

	public static void main(String[] args) {
		Autor autor = new Autor("Salman", "Ruzdi");
		Knjiga knjiga = new Knjiga("978-1-4521-6886-9", "Deca ponoci", 1981, autor);
		autor.print();
		knjiga.print();

		System.out.println();

		Autor writer = new Autor("Lisa", "Congdon");
		Knjiga book = new Knjiga("789-2-3451-9876-3", "Find your artistic voice", 2019, writer);
		writer.print();
		book.print();

		System.out.println();

		Autor pisac = new Autor("Fredrik", "Bakman");
		Knjiga novaKnjiga = new Knjiga("978-86-521-2896-9", "Moja baka vam se izvinjava", 2013, pisac);
		pisac.print();
		novaKnjiga.print();

	}

}
