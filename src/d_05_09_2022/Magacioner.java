package d_05_09_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik{

//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	public Magacioner(String imeRadnika) {
		super(imeRadnika);
	}

	private double prosecnaPlata() {
		double suma = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
		suma = suma + this.sektori.get(i).getPlata();
		}
		return suma /  this.sektori.size() * 0.5;
	}

	@Override
	public void plata() {
		double suma = this.prosecnaPlata() * this.sektori.size();
		System.out.println("Plata magacionera: " + suma);
	}
		
}
