import java.util.*;
class Demo {
	public static void main(String[] args) {
		List obj = new ArrayList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		System.out.println(obj);
		obj.add(0,"Mukesh");
		obj.add(4,"Komal");
		obj.add(2,"Mukmal");
		System.out.println(obj);
		obj.add(7,"MK");
		System.out.println(obj);
		System.out.println(obj.contains("Mukesh"));
		System.out.println(obj.isEmpty());
		System.out.println(obj.remove(8));
		System.out.println(obj);
		System.out.println(obj.size());
		obj.clear();
		System.out.println(obj);
	}
}
//[10, 20, 30, 40, 50]
//[Mukesh, 10, Mukmal, 20, 30, Komal, 40, 50]
//[Mukesh, 10, Mukmal, 20, 30, Komal, 40, MK, 50]
//true
//false
//50
//[Mukesh, 10, Mukmal, 20, 30, Komal, 40, MK]
//8
//[]
