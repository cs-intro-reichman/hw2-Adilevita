// Demonstrates the Collatz conjecture.

public class Collatz {
	public static void main(String[] args) {
			int limit = Integer.parseInt(args[0]); 
			String mode = args[1];                

			for (int seed = 1; seed <= limit; seed++) {
					int n = seed;
					int steps = 0;

					if (mode.equals("v")) {
							
							System.out.print(seed + " ");
					}

					while (n != 1) {
							if (n % 2 == 0) {
									n = n / 2;
							} else {
									n = 3 * n + 1;
							}
							steps++;
							if (mode.equals("v")) {
									System.out.print(n + " ");
							}
					}

					if (mode.equals("v")) {
							System.out.println("(" + steps + ")");
					}
			}

			System.out.println("Every one of the first " + limit + " hailstone sequences reached 1.");
	}
}
