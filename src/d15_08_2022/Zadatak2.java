package d15_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		String punoImeIPrezime = fullName("Ana", "Ristic");
		System.out.print(punoImeIPrezime);

	}

	public static String fullName(String name, String lastName) {
		String fullName = name + " " + lastName;
		return fullName;
	}
}
