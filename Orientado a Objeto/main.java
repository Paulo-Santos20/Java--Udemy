import java.util.Scanner;
import java.util.Locale;

public class main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		double gSalary, tax = 1000.00, lSalary, incre;

		System.out.println("Type your Name: ");
		name = sc.nextLine();
		System.out.println("Type your Gross Salary: ");
		gSalary = sc.nextDouble();
		
		lSalary = gSalary - tax;
		
		System.out.println("Name: "+ name);
		System.out.println("Gross salary: "+ gSalary);
		System.out.println("Tax: "+ tax);

		System.out.printf("Employee: %s, %.2f\n ", name , lSalary);

		System.out.println("Wich percentage to increase salary? ");
		incre = sc.nextDouble();

		lSalary += lSalary * incre/100.0;
		System.out.printf("Update data: %s,R$ %.2f ", name , gSalary);
		sc.close();
	}
}