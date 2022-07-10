package lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		System.out.println("Crie uma lista e adicione sete notas: ");
		
		List<Double> grades = new ArrayList<Double>();
		grades.add(7.0);
		grades.add(8.5);
		grades.add(9.3);
		grades.add(5.0);
		grades.add(7.0);
		grades.add(0.0);
		grades.add(3.6);
		
		System.out.println(grades.toString());
		
		System.out.println("Exiba a posição da nota 5.0: " + grades.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		grades.add(4, 8d);
		System.out.println(grades);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		grades.set(grades.indexOf(5d), 6.0);
		System.out.println(grades);
		
		System.out.println("Confira se a nota 5.0 está na lista: " + grades.contains(5d));
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		for(Double grade : grades) System.out.println(grade);
		
		
	}
}
