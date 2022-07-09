package inverse_order;

public class Inverse_Order {
	public static void main(String[] args) {
		int[] vector = {-6, -5, 15, 50, 8, 4};
		
		System.out.print("Vetor: ");
		
		int count = 0;
		
		while(count <= vector.length - 1) {
			System.out.print(vector[count] + " ");
			count++;
		}
		
		System.out.print("\nVetor Inverso: ");
		for(int i = (vector.length - 1); i >= 0; i--) {
			System.out.print(vector[i] + " ");
		}
	}
}
