package ExerciseOne;

public class Main {

	public static void main(String[] args) {
		//Calculator
		System.out.println("Exercício calculadora");
		calculator.sum(3, 6);
		calculator.subtraction(9, 1.8);
		calculator.multiplication(7, 8);
		calculator.division(5, 2.5);
		
		//Message
		System.out.println("Exercício mensagem");
		message.getMessage(9);
		message.getMessage(14);
		message.getMessage(1);
		
		//Empréstimo
		System.out.println("Exercício parcelas");
		loan.calculate(1000, loan.getTwoInstallments());
		loan.calculate(1000, loan.getThreeInstallments());
		loan.calculate(1000, 5);
	}
}
