package d_05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

		protected String imeRadnika;
		protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();
		
		
		public Radnik(String imeRadnika) {
			super();
			this.imeRadnika = imeRadnika;
		}
		public String getImeRadnika() {
			return imeRadnika;
		}
		public void setImeRadnika(String imeRadnika) {
			this.imeRadnika = imeRadnika;
		}
		public ArrayList<Sektor> getSektori() {
			return sektori;
		}
		
		public void setSektori(ArrayList<Sektor> sektori) {
			this.sektori = sektori;
		}
		public abstract void plata();
		
		public void zaposliUSektor(Sektor sektor) {
			this.sektori.add(sektor); 
		}
		
			
}
