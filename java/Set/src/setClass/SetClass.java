package setClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetClass {
	public static void main(String[] args) {
		System.out.println("Crie um conjunto e adicione notas");
		
		Set<Double> grades = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(grades.toString());
		
		System.out.println("Confira se a nota 5.0 está no conjunto: " + grades.contains(5d));
		
		System.out.println("Exiba a menor nota: " + Collections.min(grades));
		
		System.out.println("Exiba a maior nota: " + Collections.max(grades));
		
		Iterator<Double> iterator = grades.iterator();
		Double sum = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		System.out.println("Exiba a soma dos valores: " + sum);
		
		System.out.println("Exiba a média das notas: " + (sum/grades.size()));
		
		System.out.println("Remova a nota zero: ");
		grades.remove(0d);
		System.out.println(grades);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = grades.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println(grades);
		
		System.out.println("Exiba todas as notas na ordem emque foram informadas: ");
		Set<Double> grades2 = new LinkedHashSet<>();
		grades2.add(7d);
		grades2.add(8.5);
		grades2.add(9.3);
		grades2.add(5d);
		grades2.add(7d);
		grades2.add(0d);
		grades2.add(3.6);
		System.out.println(grades2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> grades3 = new TreeSet<>(grades2);
		System.out.println(grades3);
		
		System.out.println("Apague todo o conjunto: ");
		grades.clear();
		
		System.out.println("Confira se o conjunto está vazio: " + grades.isEmpty());
	}
}
