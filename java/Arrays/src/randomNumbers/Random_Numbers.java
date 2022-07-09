package randomNumbers;

import java.util.Random;

public class Random_Numbers {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] randomNumbers = new int[20];
		
		for(int i = 0; i < randomNumbers.length; i++) {
			int number = random.nextInt(100);
			
			randomNumbers[i] = number;
		}
		System.out.print("Números aleatórios: ");
		for (int number : randomNumbers) {
			System.out.print(number + " ");
		}
		
		System.out.print("\nAntecessores dos números aleatórios: ");
		for(int number : randomNumbers) {
			System.out.print((number - 1) + " ");
		}
		
		System.out.print("\nSucessores dos números aleatórios: ");
		for(int number : randomNumbers) {
			System.out.print((number + 1) + " ");
		}
	}
}
