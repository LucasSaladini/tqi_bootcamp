package grade;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int grade;
		
		System.out.println("Nota: ");
		grade = scan.nextInt();
		
		while(grade < 0 || grade > 10) {
			System.out.println("Nota inválida. Digite novamente");
			grade = scan.nextInt();
		}
	}
}
