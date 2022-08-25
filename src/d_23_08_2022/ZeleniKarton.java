package d_23_08_2022;

public class ZeleniKarton {

	private String imeStudenta;
	private String prezimeStudenta;
	private String brojIndeksa;
	private String predmet;
	private String imeProfesora;
	private String prezimeProfesora;
	private int ocena;

	public ZeleniKarton(String imeStudenta, String prezimeStudenta, String brojIndeksa, String predmet,
			String imeProfesora, String prezimeProfesora, int ocena) {
		super();
		this.imeStudenta = imeStudenta;
		this.prezimeStudenta = prezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.predmet = predmet;
		this.imeProfesora = imeProfesora;
		this.prezimeProfesora = prezimeProfesora;
		this.ocena = ocena;
	}

	public String getImeStudenta() {
		return imeStudenta;
	}

	public void setImeStudenta(String imeStudenta) {
		this.imeStudenta = imeStudenta;
	}

	public String getPrezimeStudenta() {
		return prezimeStudenta;
	}

	public void setPrezimeStudenta(String prezimeStudenta) {
		this.prezimeStudenta = prezimeStudenta;
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

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public String getPrezimeProfesora() {
		return prezimeProfesora;
	}

	public void setPrezimeProfesora(String prezimeProfesora) {
		this.prezimeProfesora = prezimeProfesora;
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
		System.out.println("Student: " + this.imeStudenta + " " + this.prezimeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeProfesora + " " + this.prezimeProfesora);
	}

}
