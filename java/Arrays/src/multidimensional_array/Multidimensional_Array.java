package multidimensional_array;

import java.util.Random;

public class Multidimensional_Array {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] A = new int [4][4];
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		for (int[] row  : A) {
			for (int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}
