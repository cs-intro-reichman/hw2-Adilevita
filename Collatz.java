// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String[] args) {
			int number = Integer.parseInt(args[0]);  // upper limit
			String letter = args[1];                 // "c" or "v"

			for (int i = 1; i <= number; i++) {
					int n = i;
					int steps = 0;

					// print sequence only in "v" mode
					if (letter.equals("v")) {
							System.out.print(i + " ");
					}

					while (n != 1) {
							if (n % 2 == 0) {
									n = n / 2;
							} else {
									n = 3 * n + 1;
							}

							steps++;

							if (letter.equals("v")) {
									System.out.print(n + " ");
							}
					}

					if (letter.equals("v")) {
							System.out.println("(" + steps + ")");
					}
			}

			System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
	}
}