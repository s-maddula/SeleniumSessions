package JavaSessions;

public class A {

	public static void main(String[] args) {

		System.out.println("A - main method...");

		// AA.main(args);

		printNumericPartGeneric1("your transaction id is: 12345 and reference id is 34567");

	}

	public static void printNumericPartGeneric1(String s) {

		String[] arr = s.split(" ");
		String temp;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i].replaceAll("[^0-9]", "");
			if (!temp.isEmpty()) {
				System.out.println(temp);
			}
		}
	}

}
