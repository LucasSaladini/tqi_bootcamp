package list_ordenation;

import java.util.ArrayList;
import java.util.Collections;
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