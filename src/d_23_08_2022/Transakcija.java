package d_23_08_2022;

public class Transakcija {
	private String id;
	private double racunPosiljalac;
	private double racunPrimalac;
	private Racun posiljalac;
	private Racun primalac;

	public Transakcija(String id, double racunPosiljalac, double racunPrimalac, Racun posiljalac, Racun primalac) {
		super();
		this.id = id;
		this.racunPosiljalac = racunPosiljalac;
		this.racunPrimalac = racunPrimalac;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getRacunPosiljalac() {
		return racunPosiljalac;
	}

	public void setRacunPosiljalac(double racunPosiljalac) {
		this.racunPosiljalac = racunPosiljalac;
	}

	public double getRacunPrimalac() {
		return racunPrimalac;
	}

	public void setRacunPrimalac(double racunPrimalac) {
		this.racunPrimalac = racunPrimalac;
	}

	public Racun getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Racun posiljalac) {
		this.posiljalac = posiljalac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	private double provizija(double visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		} else {
			return visinaTransakcije * 0.01;
		}
	}

	public void izvrsiTransakciju(double visinaTransakcije) {
		if (this.racunPosiljalac > visinaTransakcije + this.provizija(visinaTransakcije)) {
			System.out.println(this.racunPosiljalac - visinaTransakcije - this.provizija(visinaTransakcije));
		} else {
			System.out.println("Nemate dovoljno sredstava na racunu.");
		}
		System.out.println(this.racunPrimalac + visinaTransakcije);
	}

	public void print() {
		System.out.println("Racun sa: " + this.posiljalac.getPunoIme() + " - " + this.racunPosiljalac);
		System.out.println("Racun na: " + this.primalac.getPunoIme() + " - " + this.racunPrimalac);
	}

}
