package d_26_08_2022;

public class Karton{
//	Kreirati klasu Karton koja ima:
//		- tip kartona (crveni, zuti)
//		- konstuktore za koje mislite da ce vam trebati
//		- gettere i settere za karton

	private String karton;

	public Karton(String karton) {
		super();
		this.karton = karton;
	}

	public String getKarton() {
		return karton;
	}

	public void setKarton(String karton) {
		this.karton = karton;
	}

}
