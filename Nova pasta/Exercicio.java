import java.util.Locale;
import java.util.Scanner;

import Entidades.Calc;

public class Exercicio {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Calc c = new Calc();

		System.out.println("Enter rectangle width and height: ");
		c.larg = sc.nextDouble();
		c.alt = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", c.area());
		System.out.printf("PERIMETER = %.2f%n", c.peri());
		System.out.printf("DIAGONAL = %.2f%n", c.diag());
		sc.close();
	}
}
