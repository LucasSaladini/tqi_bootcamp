package ExerciseTwo;

public class Quadrilaterals {

	public static void area(double side) {
		System.out.println("Área do quadrado: " + side * side);
	}

	public static void area(double side1, double side2) {
		System.out.println("Área do retângulo: " + side1 * side2);
	}
	
	public static void area(double biggerBase, double smallerBase, double height) {
		System.out.println("Área do trapézio: " + ((biggerBase + smallerBase)*height)/2);
	}
}
