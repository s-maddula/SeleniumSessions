package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {

		// TC --> O(n) --BIG O

		int i = 1;
		// O(1)

		System.out.println(i + 10); // O(1)

		for (int k = 1; k <= 5; k++) {
			System.out.println(k);
		}
		// 1 + 5 + 5 + 5
		// 1 + n + n + n ==> 1+3n ==> 3n ==> n ==> O(n)
		// linear equation

		// two for loops: outer-->inner loops:
		for (int p = 0; p < 3; p++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(p + "" + j + " ");// 00

			}
			System.out.println();

		}
		
		//(1+3n)(1+3n) ==> 1+3n+3n+9n^2 ==> 1+6n+9n^2 ===> n^2+n
		//quadratic equation

	}

}