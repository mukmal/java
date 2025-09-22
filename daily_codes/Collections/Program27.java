import java.util.*;
class Movie {
	String mName;
	double imdb;
	int year;
	Movie(String mName,double imdb, int year) {
		this.mName = mName;
		this.imdb = imdb;
		this.year = year;
	}
	public String toString() {
		return " { "+mName+": "+year+": "+imdb+" } ";
	}
}
class SortByName implements Comparator<Movie>	{
	public int compare(Movie obj1,Movie obj2) {
		return obj1.mName.compareTo(obj2.mName);
	}
}
class SortByRating implements Comparator<Movie> {
	public int compare(Movie obj1,Movie obj2) {
		return (int)(obj1.imdb-obj2.imdb);
	}
}
class SortByYear implements Comparator<Movie> {
	public int compare(Movie obj1,Movie obj2) {
		return (int)(obj1.year-obj2.year);
	}
}
class ComparatorDemo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new SortByName());
		Movie m1 = new Movie("12th fail",9.8,2024);
		Movie m2 = new Movie("Uri",9.0,2017);
		Movie m3 = new Movie("Article370",7.0,2023);
		Movie m4 = new Movie("Maharaja",9.1,2024);

		tm.put(m1,150.00);
		tm.put(m2,350.50);
		tm.put(m3,300.00);
		tm.put(m4,400.00);
		
		System.out.println(tm);
	}
}
