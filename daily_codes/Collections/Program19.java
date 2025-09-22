import java.util.*;
class SortedSetMethods {
	public static void main(String[] args) {
		NavigableSet ss = new TreeSet();
		ss.add(10);
		ss.add(30);
		ss.add(70);
		ss.add(20);
		ss.add(10);
		ss.add(40);
		ss.add(50);
		ss.add(10);
		ss.add(60);
		System.out.println(ss);
		System.out.println(ss.lower(40));
		System.out.println(ss.floor(40));
		System.out.println(ss.lower(45));
		System.out.println(ss.floor(45));
		System.out.println(ss.higher(40));
		System.out.println(ss.ceiling(40));
		ss.pollFirst();
		ss.pollLast();
		System.out.println(ss);
	}
}
//[10, 20, 30, 40, 50, 60, 70]
//30
//40
//40
//40
//50
//40
//[20, 30, 40, 50, 60]
