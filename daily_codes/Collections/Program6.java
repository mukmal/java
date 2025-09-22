import java.util.*;
class Demo {
	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add(10);
		obj.add(20);
		obj.add("Shashi");
		obj.add(10);
		System.out.println(obj);
		for(Object x : obj) {
			System.out.println(x);
		}
	}

}

//[10, 20, Shashi, 10]
//10
//20
//Shashi
//10
