package list_ordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_Ordenation {
	public static void main(String[] args) {
		List <Cat> myCats = new ArrayList<>() {{
			add(new Cat("Jon", 18, "preto"));
			add(new Cat("Simba", 6, "tigrado"));
			add(new Cat("Jon", 12, "amarelo"));
		}};
		System.out.println("--\tOrdem de Inserção\t--");
		System.out.println(myCats);
		
		System.out.println("--\tOrdem aleatória\t--");
		Collections.shuffle(myCats);
		System.out.println(myCats);
		
		System.out.println("--\tOrdem Natural (nome)\t--");
		Collections.sort(myCats);
		System.out.println(myCats);
		
		System.out.println("--\tOrdem Idade\t--");
		Collections.sort(myCats, new ComparatorAge());
		//myCats.sort(new ComparatorAge());
		System.out.println(myCats);
		
		System.out.println("--\tOrdem Cor\t--");
		Collections.sort(myCats, new ComparatorColor());
		//myCats.sort(new CompartorColor());
		System.out.println(myCats);
		
		System.out.println("--\tOrdem Nome/Cor/Idade\t--");
		Collections.sort(myCats, new ComparatorNomeCorIdade());
		//myCats.sort(new ComparatorNomeCorIdade());
		System.out.println(myCats);
	}
}

class Cat implements Comparable<Cat>{
	private String name;
	private Integer age;
	private String color;
	
	public Cat(String name, Integer age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "{" + 
				"nome='" + name + '\'' + 
				", idade=" + age +
				", cor='" + color + '\'' +
				'}';
	}
	
	@Override
	public int compareTo(Cat cat) {
		return this.getName().compareToIgnoreCase(cat.getName());
	}
}

class ComparatorAge implements Comparator<Cat> {
	@Override
	public int compare(Cat c1, Cat c2) {
		return Integer.compare(c1.getAge(), c2.getAge());
	}
}

class ComparatorColor implements Comparator<Cat> {
	@Override
	public int compare(Cat c1, Cat c2) {
		return c1.getColor().compareToIgnoreCase(c2.getColor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Cat> {
	@Override
	public int compare(Cat c1, Cat c2) {
		int name = c1.getName().compareToIgnoreCase(c2.getName());
		if(name != 0) return name;
		
		int color = c1.getColor().compareToIgnoreCase(c2.getColor());
		if(color != 0) return color;
		
		return Integer.compare(c1.getAge(), c2.getAge());
	}
}