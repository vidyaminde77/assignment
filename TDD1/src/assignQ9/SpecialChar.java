package assignQ9;

public class SpecialChar {

	public static String splchar(String str) {

		String v = str.replaceAll("[@$-.]", "");

		return v;

	}

	public static void main(String[] args) {
		System.out.println(SpecialChar.splchar("This @ Red $car-."));
	}

}
