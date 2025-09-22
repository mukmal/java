import java.util.*;
class Demo {
	int data;
	Demo(int data) {
		this.data=data;
	}
	public String toString() {
		return data+"";
	}
}
class HashDemo {
	public static void main(String[] args) {
		HashMap obj = new HashMap();
		Demo obj1 = new Demo(10);
		Demo obj2 = new Demo(20);
		Demo obj3 = new Demo(30);
		Demo obj4 = new Demo(40);
		obj.put(obj1,"Ten");
		obj.put(obj2,"Tweenty");
		obj.put(obj3,"Thirty");
		System.out.println(obj);
	}
}
//{20=Tweenty, 10=Ten, 30=Thirty}
