// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
			int n = Integer.parseInt(args[0]);
			double sum = 0.0;
			int sign = 1;

			for (int i = 0; i < n; i++) {
					double term = 1.0 / (2 * i + 1);
					sum += sign * term;
					sign = -sign;
			}

			double piApprox = 4 * sum;

			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated:     " + piApprox); // 5 רווחים
	}
}
