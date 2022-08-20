package d_19_08_2022;

public class FacebookPost {

	private String imeIPrezime;
	private String imeIPrezimeFriend;
	private String tekstObjave;
	private int brojLajkova;
	private int brojDeljenja;

	public void setimeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public void setimeIPrezimeFriend(String imeIPrezimeFriend) {
		this.imeIPrezimeFriend = imeIPrezimeFriend;
	}

	public void settekstObjave(String tekstObjave) {
		this.tekstObjave = tekstObjave;
	}

	public void setbrojLajkova(int brojLajkova) {
		this.brojLajkova = brojLajkova;
	}

	public void setbrojDeljenja(int brojDeljenja) {
		this.brojDeljenja = brojDeljenja;
	}

	public String getimeIPrezime() {
		return imeIPrezime;
	}

	public String getimeIPrezimeFriend() {
		return imeIPrezimeFriend;
	}

	public String gettekstObjave() {
		return tekstObjave;
	}

	public int getbrojLajkova() {
		return brojLajkova;
	}

	public int getbrojDeljenja() {
		return brojDeljenja;
	}

	public FacebookPost() {

	}

	public FacebookPost(String imeIPrezime, String imeIPrezimeFriend, String tekstObjave) {
		this.imeIPrezime = imeIPrezime;
		this.imeIPrezimeFriend = imeIPrezimeFriend;
		this.tekstObjave = tekstObjave;
	}

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
