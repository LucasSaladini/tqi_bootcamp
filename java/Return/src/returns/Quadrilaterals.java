package returns;

public class Quadrilaterals {

	public static double area(double side) {
		return side * side;
	}

	public static double area(double side1, double side2) {
		return side1 * side2;
	}
	
	public static double area(double biggerBase, double smallerBase, double height) {
		return ((biggerBase + smallerBase) * height) / 2;
	}
}
