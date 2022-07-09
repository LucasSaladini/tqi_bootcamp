package bigger_and_average;

import java.util.Scanner;

public class Bigger_And_Average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number;
		int bigger = 0;
		float sum = 0f;
		
		int count = 0;
				
		do {
			System.out.println("Número: ");
			number = scan.nextInt();
			
			sum = sum + number;
			
			if(number > bigger) bigger = number;
			count = count + 1;
		} while(count < 5);
		
		System.out.println("Maior: " + bigger);
		System.out.println("Média: " + (sum/5));
	}
}
