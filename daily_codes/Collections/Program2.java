import java.util.*;
class Demo extends ArrayList {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(50);
		obj.add(10);
		obj.add(90);
		obj.add(20);
		obj.add(30);
		obj.add(50);
		obj.add(20);
		obj.add(80);
		obj.add(70);

		System.out.println(obj);
		//indexOf
		System.out.println(obj.indexOf(10));
		//lastIndexOf
		System.out.println(obj.lastIndexOf(20));
		//trimToSize
		obj.trimToSize();
		//removeRange
		obj.removeRange(3,7);
		System.out.println(obj);
		Demo obj1 = new Demo();
		obj1.add("Mukesh");
		obj1.add("Sanjay");
		obj1.add("Shinde");
		obj.addAll(obj1);
		System.out.println(obj);
		obj.removeAll(obj1);
		System.out.println(obj);
	}
}

//[10, 20, 30, 50, 10, 90, 20, 30, 50, 20, 80, 70]
//0
//9
//[10, 20, 30, 30, 50, 20, 80, 70]
//[10, 20, 30, 30, 50, 20, 80, 70, Mukesh, Sanjay, Shinde]
//[10, 20, 30, 30, 50, 20, 80, 70]
