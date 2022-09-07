package d_06_09_2022;

public class Planina {
//	Kreirati klasu Planina koja od privatnih atributa ima:
//		● ime planine
//		● naziv države u kojoj se
//		nalazi
//		● visinu planine.
//		a od javnih metoda:
//		● default-ni konstruktor i konstuktor koji postavlja sve
//		parametre
//		● gettere i settere za sve atribute
	private String planina;
	private String drzava;
	private int visina;

	public Planina() {

	}

	public Planina(String planina, String drzava, int visina) {
		this.planina = planina;
		this.drzava = drzava;
		this.visina = visina;
	}

	public String getPlanina() {
		return planina;
	}

	public void setPlanina(String planina) {
		this.planina = planina;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

}
