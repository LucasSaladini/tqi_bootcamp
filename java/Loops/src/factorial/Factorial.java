package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fatorial: ");
		int factorial = scan.nextInt();
		
		int multiplication = 1;
		
		System.out.println(factorial + "! = ");
		for(int i = factorial; i >= 1; i--) {
			multiplication = multiplication * i;
		}
		
		System.out.println(multiplication);
	}
}
