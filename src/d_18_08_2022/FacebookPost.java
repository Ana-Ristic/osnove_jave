package d_18_08_2022;

public class FacebookPost {

	public String imeIPrezime;
	public String imeIPrezimeFriend;
	public String tekstObjave;
	public int brojLajkova;
	public int brojDeljenja;

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}

	public void dislike() {
		if (this.brojLajkova >= 1) {
			this.brojLajkova = this.brojLajkova + 1;
		} else {
			this.brojLajkova = 0;
		}
	}

	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}

	public void print() {
		System.out.println(imeIPrezime + " >>> " + imeIPrezimeFriend);
		System.out.println(tekstObjave);
		System.out.println("Likes " + brojLajkova + " | " + "Shares " + brojDeljenja);
	}

}
