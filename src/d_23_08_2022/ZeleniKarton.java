package d_23_08_2022;

public class ZeleniKarton {

	private String punoImeStudenta;
	private String brojIndeksa;
	private String predmet;
	private String punoImeProfesora;
	private int ocena;

	public ZeleniKarton(String punoImeStudenta, String brojIndeksa, String predmet,
			String punoImeProfesora, int ocena) {
		super();
		this.punoImeStudenta = punoImeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.predmet = predmet;
		this.punoImeProfesora = punoImeProfesora;
		this.ocena = ocena;
	}

	public String getPunoImeStudenta() {
		return punoImeStudenta;
	}

	public void setPunoImeStudenta(String punoImeStudenta) {
		this.punoImeStudenta = punoImeStudenta;
	}
	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getPunoImeProfesora() {
		return punoImeProfesora;
	}

	public void setPunoImeProfesora(String punoImeProfesora) {
		this.punoImeProfesora = punoImeProfesora;
	}
	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean ispit() {
		if (ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void stampaj() {
		System.out.println(this.predmet + " - " + this.ocena);
		System.out.println("Student: " + this.punoImeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.punoImeProfesora);
	}

}
