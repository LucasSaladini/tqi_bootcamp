package ExerciseOne;

public class calculator {

	public static void sum(double number1, double number2) {
		double result = number1 + number2;
		
		System.out.println("A soma de " + number1 + " mais " + number2 + " é " + result);
	}
	
	public static void subtraction(double number1, double number2) {
		double result = number1 - number2;
		
		System.out.println("A subtração de " + number1 + " menos " + number2 + " é " + result);
	}
	
	public static void multiplication(double number1, double number2) {
		double result = number1 * number2;
		
		System.out.println("A multiplicação de " + number1 + " vezes " + number2 + " é " + result);
	}
	
	public static void division(double number1, double number2) {
		double result = number1 / number2;
		
		System.out.println("A divisão de " + number1 + " por " + number2 + " é " + result);
	}

}
