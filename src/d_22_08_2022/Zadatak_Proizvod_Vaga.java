package d_22_08_2022;

public class Zadatak_Proizvod_Vaga {

	public static void main(String[] args) {
		
		Proizvod proizvod = new Proizvod("sifra-234", "Jacobs kafa", 2000);
		
		Vaga vaga = new Vaga();
		vaga.setMernaJedinica("Ib");
		vaga.setProizvod(proizvod);
		vaga.print(0.5);
		
		System.out.println();
		
		Proizvod avokado = new Proizvod("av-87-9", "Avokado", 180 );
		
		Vaga novaVaga = new Vaga();
		novaVaga.setMernaJedinica("kg");
		novaVaga.setProizvod(avokado);
		novaVaga.print(0.4);
		

	}

}
