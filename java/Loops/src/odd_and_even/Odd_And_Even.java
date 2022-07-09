package odd_and_even;

import java.util.Scanner;

public class Odd_And_Even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberQuantity;
		int number;
		int quantityEven = 0, quantityOdd = 0;
		
		System.out.println("Quantidade de números: ");
		numberQuantity = scan.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Número: ");
			number = scan.nextInt();
			
			if(number % 2 == 0) quantityEven++;
			else quantityOdd++;
			
			count++;
		} while(count < numberQuantity);
		
		System.out.println("Quantidade Par: " + quantityEven);
		System.out.println("Quantidade Ímpar: "  + quantityOdd);
	}
}
