package JavaSessions;

public class TwoForLOOPS {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + "\t");
			}

			System.out.println();

		}

		System.out.println("---------");

		int n[] = new int[5];
		n[0] = 4;
		n[1] = 3;
		n[2] = 2;
		n[3] = 1;
		n[4] = 0;
		for (int k = 0; k < n.length; k++) {
			System.out.println("n = " + n[k]);
		}
		System.out.println("---------");

	}
}
