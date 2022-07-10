package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
		
		System.out.println("Exiba a terceira nota informada: " + grades.get(2));
		System.out.println(grades.toString());
		
		System.out.println("Exiba a menor nota: " + Collections.min(grades));
		
		System.out.println("Exiba a maior nota: " + Collections.max(grades));
		
		Iterator<Double> iterator = grades.iterator();
		Double sum = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			sum += next;
		}
		System.out.println("Exiba a soma dos valores: " + sum);
		
		System.out.println("Exiba a média das notas: " + (sum/grades.size()));
		
		System.out.println("Remova a nota 0: ");
		grades.remove(0d);
		System.out.println(grades);
		
		System.out.println("Remova a nota na posição 0: ");
		grades.remove(0);
		System.out.println(grades);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = grades.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			
			if(next < 7) iterator1.remove();
		}
		System.out.println(grades);
		
		System.out.println("Apague toda a lista: ");
		grades.clear();
		System.out.println(grades);
		
		System.out.println("Confira se a lista está vazia: " + grades.isEmpty());
	}
}
