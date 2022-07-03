package ExerciseOne;

public class loan {

	public static int getTwoInstallments() {
		return 2;
	}
	
	public static int getThreeInstallments() {
		return 3;
	}
	
	public static double getTwoInstallmentsRate() {
		return 0.3;
	}
	
	public static double getThreeInstallmentsRate() {
		return 0.45;
	}
	
	public static void calculate(double value, double installments) {
		if (installments == 2) {
			double finalValue = value + (value * getTwoInstallmentsRate());
			
			System.out.println("Valor final do empréstimo para duas parcelas: R$" + finalValue);
		} else if (installments == 3) {
			double finalValue = value + (value * getThreeInstallmentsRate());
			
			System.out.println("O valor final do empréstimo para três parcelas R$" + finalValue);
		} else {
			System.out.println("Quantidade de parcelas não aceita.");
		}
	}
}
