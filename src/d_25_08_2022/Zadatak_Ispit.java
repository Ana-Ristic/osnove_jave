package d_25_08_2022;

public class Zadatak_Ispit {

	public static void main(String[] args) {
		Student student = new Student("234", "Petar Ilic", "osnovne");
		
		Ispit ispit = new Ispit(8, "Zlatko Pesic");
		Ispit ispit1 = new Ispit(5, "Mira Peric");
		Ispit ispit2 = new Ispit(6, "Rada Ilic");
		
		ispit.setPredmet("Antorpologija");
		ispit1.setPredmet("Sociologija rada");
		ispit2.setPredmet("Uvod u sociologiju");
		
		student.dodajIspit(ispit);
		student.dodajIspit(ispit1);
		student.dodajIspit(ispit2);
		student.print();
		

	}

}
