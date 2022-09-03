package mini_projekat;

public class Player {
	protected String punoIme;

	public Player(String punoIme) {
		super();
		this.punoIme = punoIme;
	}

	public Player() {
		super();
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public void print() {
		System.out.println("Igrac: " + this.punoIme);
	}

}
