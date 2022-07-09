package consoant;

import java.util.Scanner;

public class Consoant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] consoants = new String[6];
		
		int quantityCosoants = 0;
		
		int count = 0;
		
		do {
			System.out.println("Letra: ");
			
			String letter = scan.next();
			
			if(!(letter.equalsIgnoreCase("a") ||
					letter.equalsIgnoreCase("e") ||
					letter.equalsIgnoreCase("i") ||
					letter.equalsIgnoreCase("o") ||
					letter.equalsIgnoreCase("u"))) {
			consoants[count] = letter;
			quantityCosoants++;
			}
			
			count++;
		} while(count < consoants.length);
		
		System.out.println("Consoantes: ");
		for (String consoant : consoants) {
			if(consoant != null) {				
				System.out.print(consoant + " ");
			}
		}
		System.out.println("Quantidade de consoantes: " + quantityCosoants);
	}
}
