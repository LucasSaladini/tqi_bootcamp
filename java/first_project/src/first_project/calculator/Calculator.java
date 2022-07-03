<<<<<<< HEAD
package first_project.calculator;
import java.util.Scanner;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a, b;
			
			System.out.println("Digite o primeiro valor: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo valor: ");
			b = scan.nextInt();
			
			int sum = sum(a,b);
			int subtraction = subtraction(a,b);
			int multiplication = multiplication(a,b);
			float division = division(a,b);
			
			System.out.println("soma " + sum);
			System.out.println("subtação " + subtraction);
			System.out.println("multiplicação " + multiplication);
			System.out.println("divisão " + division);
		}
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int subtraction(int a, int b) {
		return a - b;
	}
	public static float division(int a, int b) {
		return a / b;
	}
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	
}
=======
package first_project.calculator;
import java.util.Scanner;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a, b;
			
			System.out.println("Digite o primeiro valor: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo valor: ");
			b = scan.nextInt();
			
			int sum = sum(a,b);
			int subtraction = subtraction(a,b);
			int multiplication = multiplication(a,b);
			float division = division(a,b);
			
			System.out.println("soma " + sum);
			System.out.println("subtação " + subtraction);
			System.out.println("multiplicação " + multiplication);
			System.out.println("divisão " + division);
		}
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int subtraction(int a, int b) {
		return a - b;
	}
	public static float division(int a, int b) {
		return a / b;
	}
	public static int multiplication(int a, int b) {
		return a * b;
	}
	
	
}
>>>>>>> 2779e4f35a848a993970d8085de04ff38d8b26b1
