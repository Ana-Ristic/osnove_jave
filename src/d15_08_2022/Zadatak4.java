package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		
		
		
		podaciOKorisniku ("2503981735047", "Ana", "Ristic", 1981, true);
	}
	
	public static void podaciOKorisniku (String jmbg,String ime,String prezime,int godRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God.rodjenja: " + godRodjenja);
		System.out.println("Ativan: " + aktivan);
		
	}
}
