import java.util.*;
class Demo {
	public static void main(String[] args) {
		HashSet obj = new HashSet();
		obj.add(10);
		obj.add(20);
		obj.add(70);
		obj.add(40);
		obj.add(80);
		obj.add(10);	//ignored
		System.out.println(obj);
	}
}

//[80, 20, 70, 40, 10]
