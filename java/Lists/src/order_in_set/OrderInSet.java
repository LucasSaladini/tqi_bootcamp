package order_in_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrderInSet {
	public static void main(String[] args) {
		System.out.println("--\tOrdem aleatória\t--");
		Set<Series> mySeries = new HashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "comédia", 25));
		}};
		for(Series serie : mySeries) System.out.println(serie.getName() + " - " 
				+ serie.getGenre() + " - " + serie.getEpisodeTime());
		
		System.out.println("--\tOrdem inserção\t--");
		Set<Series> mySeries1 = new HashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "comédia", 25));
		}};
		for(Series serie : mySeries1) System.out.println(serie.getName() + " - " 
				+ serie.getGenre() + " - " + serie.getEpisodeTime());
		
		System.out.println("--\tOrdem natural\t--");
		Set<Series> mySeries2 = new TreeSet<>(mySeries1);
		for(Series serie : mySeries2) System.out.println(serie.getName() + " - "
				+ serie.getGenre() + " - " + serie.getEpisodeTime());
		
		System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
		Set<Series> mySeries3 = new TreeSet<>(new ComparatorNameGenreEpisodeTime());
		mySeries3.addAll(mySeries);
		for(Series serie : mySeries3) System.out.println(serie.getName() + " - "
				+ serie.getGenre() + " - " + serie.getEpisodeTime());
	}
}

class Series implements Comparable <Series> {
	private String name;
	private String genre;
	private Integer episodeTime;
	
	public Series(String name, String genre, Integer episodeTime) {
		this.name = name;
		this.genre = genre;
		this.episodeTime = episodeTime;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public Integer getEpisodeTime() {
		return episodeTime;
	}
	
	@Override
	public String toString() {
		return "Serie{" +
				"name='" + name +'\'' + 
				", genre='" + genre + '\'' +
				", episodeTime=" + episodeTime +
				'}';
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series serie = (Series) o;
        return name.equals(serie.name) && genre.equals(serie.genre) && episodeTime.equals(serie.episodeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, episodeTime);
    }
    
    @Override
    public int compareTo(Series series) {
    	int episodeTime = Integer.compare(this.getEpisodeTime(), series.getEpisodeTime());
    	if(episodeTime != 0) return episodeTime;
    	return this.getGenre().compareTo(series.getGenre());
    }
}

class ComparatorNameGenreEpisodeTime implements Comparator<Series> {
	@Override
	public int compare(Series s1,Series s2) {
		int name = s1.getName().compareTo(s2.getName());
		if(name !=0) return name;
		
		int genre = s1.getGenre().compareTo(s2.getGenre());
		if(genre != 0) return genre;
		
		return Integer.compare(s1.getEpisodeTime(), s2.getEpisodeTime());
	}
}