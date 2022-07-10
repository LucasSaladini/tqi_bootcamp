package orderMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrderMap {
	public static void main(String[] args) {
		System.out.println("--\tOrdem aleatória\t--");
		Map<String, Book> myBooks = new HashMap<>() {{
			put("Hawking, Stephen", new Book("Uma breve história do tempo", 256));
			put("Duhigg, Charles", new Book("O poder do hábito", 408));
			put("Harari, Yuval Noah", new Book("21 lições para o século 21", 432));
		}};
		for(Map.Entry<String, Book> book : myBooks.entrySet())
			System.out.println(book.getKey() + " - " + book.getValue().getName());
		
		System.out.println("--\tOrdem inserção\t--");
		Map<String, Book> myBooks1 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Book("Uma breve história do tempo", 256));
			put("Duhigg, Charles", new Book("O poder do hábito", 408));
			put("Harari, Yuval Noah", new Book("21 lições para o século 21", 432));
		}};
		for(Map.Entry<String, Book> book : myBooks1.entrySet())
			System.out.println(book.getKey() + " - " + book.getValue().getName());
		
		System.out.println("--\tOrdem alfabética autores\t--");
		Map<String, Book> myBooks2 = new TreeMap<>(myBooks1);
		for(Map.Entry<String, Book> book : myBooks2.entrySet())
			System.out.println(book.getKey() + " - " + book.getValue().getName());
		
		System.out.println("--\tOrdem alfabética nomes dos livros\t--");
		Set<Map.Entry<String, Book>> myBooks3 = new TreeSet<>(new ComparatorName());
		myBooks3.addAll(myBooks.entrySet());
		for(Map.Entry<String, Book> book : myBooks3)
			System.out.println(book.getKey() + " - " + book.getValue().getName());		
	}
}

class Book {
	private String name;
	private Integer pages;
	
	public Book(String name, Integer pages) {
		this.name = name;
		this.pages = pages;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getPages() {
		return pages;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Book book = (Book) o;
		return name.equals(book.name) && pages.equals(book.pages);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, pages);
	}
	
	@Override
	public String toString() {
		return "Book{" + 
				"name='" + name +'\'' +
				", pages=" + pages +
				'}';
	}
}

class ComparatorName implements Comparator<Map.Entry<String, Book>>{

    @Override
    public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
        return b1.getValue().getName().compareToIgnoreCase(b2.getValue().getName());
    }
}