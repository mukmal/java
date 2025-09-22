import java.util.*;
class Demo implements Comparable<Demo> {
	String str = null;
	Demo(String str) {
		this.str = str;
	}
	public int compareTo(Demo obj) {
		return -str.compareTo(obj.str);
	}
	public String toString() {
		return str;
	}
}
class DDemo {
	public static void main(String[] args){
		TreeSet t = new TreeSet();
		t.add(new Demo("Mukesh"));
		t.add(new Demo("Sanjay"));
		t.add(new Demo("Shinde"));
		System.out.println(t);
	}
}

//[Shinde, Sanjay, Mukesh]
