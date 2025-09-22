import java.util.*;
class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		System.out.println(al);
		for(Integer x : al) {
			System.out.println(x);
		}
	}
}
//[10, 20, 30, 40, 10]
//10
//20
//30
//40
//10
