package d_19_08_2022;

public class FacebookPost_Zadatak {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete 
//			da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			 Konstruktore:
//			difoltni konstuktor
//			konstuktor koji postavlja ime i prezime korisnika ko je objavio,
//			korisnika na kom je profilu objavnljen i tekst objave
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
		
		FacebookPost noviPost = new FacebookPost("Ana", "Conrad", "Hey!");

		FacebookPost noviKomentar = new FacebookPost();
		noviKomentar.setimeIPrezime("Damon Alban");
		noviKomentar.setimeIPrezimeFriend("Mick Jones");
		noviKomentar.settekstObjave("It's a Casio on a plastic beach.");
		noviKomentar.setbrojLajkova(345);
		noviKomentar.setbrojDeljenja(234);
		noviKomentar.print();

		System.out.println();

		FacebookPost newComment = new FacebookPost();
		newComment.setimeIPrezime("Back Hansen");
		newComment.setimeIPrezimeFriend("to All");
		newComment.settekstObjave("I'm driver, I'm a winner. Things are gonna change, I can feel it.");
		newComment.setbrojLajkova(213);
		newComment.setbrojDeljenja(123);
		newComment.print();

		System.out.println();

	}

}
