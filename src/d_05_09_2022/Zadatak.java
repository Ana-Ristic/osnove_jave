package d_05_09_2022;

//import java.util.ArrayList;

public class Zadatak {

	public static void main(String[] args) {
// 		  U glavnom programu kreirati jednog magacionera i jednog menadzera,
//		  postaviti sektore u kojima rade i ispisati platu za svakog

		Radnik menadzer = new Menadzer("Jovan Pesic");
		Radnik magacioner = new Magacioner("Ivan Pesic");
		Sektor s1 = new Sektor("magacin mehanike", 17000);
		Sektor s2 = new Sektor("magacin elektro-komponenti", 10000);
		Sektor s3 = new Sektor("magacin gotovih uredjaja", 15000);
		Sektor s4 = new Sektor("menadzer prodaje", 25000);
		Sektor s5 = new Sektor("menadzer nabavke", 36000);
		menadzer.zaposliUSektor(s4);
		menadzer.zaposliUSektor(s5);
		magacioner.zaposliUSektor(s1);
		magacioner.zaposliUSektor(s2);
		magacioner.zaposliUSektor(s3);
		
		menadzer.plata();
		magacioner.plata();
		
		
	}

}
