package multiplication_table;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		
		int multiplicationTable = scan.nextInt();
		
		System.out.println("Tabuada do " + multiplicationTable);
		
		for(int i = 1;i <= 10;i++) {
			System.out.println(multiplicationTable + " X " + i + " = " + (multiplicationTable*i));
		}
	}
}
