package d_18_08_2022;

public class Zadatak_FacebookPost {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
		
		
		FacebookPost noviKomentar = new FacebookPost();
		noviKomentar.imeIPrezime = "Damon Alban";
		noviKomentar.imeIPrezimeFriend = "Mick Jones";
		noviKomentar.tekstObjave = "It's a Casio on a plastic beach.";
		noviKomentar.brojLajkova = 456;
		noviKomentar.brojDeljenja = 234;

		noviKomentar.print();
		System.out.println();

		FacebookPost newComment = new FacebookPost();
		newComment.imeIPrezime = "Back Hansen";
		newComment.imeIPrezimeFriend = "to All";
		newComment.tekstObjave = "I'm driver, I'm a winner. Things are gonna change, I can feel it.";
		newComment.brojLajkova = 123;
		newComment.brojDeljenja = 56;

		newComment.print();
			


		
		
	}

}
