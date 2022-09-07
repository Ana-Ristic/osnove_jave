package d_06_09_2022;

public class Zadatak_PlaninarskiDom {

	public static void main(String[] args) {
//		U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko
//		rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda.
		
		Planina planina = new Planina("Besna Kobila", "Srbija", 1923);
		PlaninarskiDom dom = new PlaninarskiDom("Rajac", 1956);
		Planinar p1 = new RekreativniPlaninar("123", "Petar Jovic", 5, "Nisavski", 1000);
		Planinar p2 = new RekreativniPlaninar("098", "Senka Pesic", 10, "Zajecarski", 1800);
		Planinar p3 = new RekreativniPlaninar("564", "Danica Lazarevic", 7, "Pirotski", 2340);
		Planinar p4 = new Alpinista("67", "Uros Peric", 4);
		Planinar p5 = new Alpinista("765", "Ivana Ilic",7);
		Planinar p6 = new Alpinista("725", "Igor Maric", 9);
		dom.uclaniPlaninara(p6);
		dom.uclaniPlaninara(p5);
		dom.uclaniPlaninara(p4);
		dom.uclaniPlaninara(p3);
		dom.uclaniPlaninara(p2);
		dom.uclaniPlaninara(p1);
		dom.stampaj();
		System.out.println();
		System.out.println("Broj uspesnih uspona: " + dom.brUspesnihUspona(planina));
		System.out.println("Mesecni prihodi doma su " + dom.mesecniPrihod());
		dom.izbaciPlaninara("098");
		System.out.println("Mesecni prihodi doma po izbacivanju clana su: " + dom.mesecniPrihod());
		

	}

}
