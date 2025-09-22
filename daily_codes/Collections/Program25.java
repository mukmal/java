import java.util.*;
class Demo {
	int data;
	Demo(int data) {
		this.data = data;
	}
	public void finalize() {
		System.out.println("In finalize "+data);
	}
	public String toString() {
		return data+"";
	}
}
class WeakDemo {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
		Demo obj1 = new Demo(10);
		Demo obj2 = new Demo(20);
		Demo obj3 = new Demo(30);

		whm.put(obj1,"Xyz");
		whm.put(obj2,"Pqr");
		whm.put(obj3,"Abc");

		System.out.println(whm);
		obj1 = null;
		obj3 = null;
		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			System.out.println("IE");
		}
		System.out.println(whm);
	}
}

//{20=Pqr, 10=Xyz, 30=Abc}
//In finalize 30
//In finalize 10
//{20=Pqr}
