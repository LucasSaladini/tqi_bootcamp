package returns;

public class Main {

	public static void main(String[] args) {
		//Returns
		System.out.println("Exercício retornos");
		
		double squareArea = Quadrilaterals.area(3);
		System.out.println("Área do quadrado: " + squareArea);
		
		double rectangleArea = Quadrilaterals.area(5, 5);
		System.out.println("Área do retângulo: " + rectangleArea);
		
		double trapezeArea = Quadrilaterals.area(7, 8, 9);
		System.out.println("Área do trapézio: " + trapezeArea);
	}

}
