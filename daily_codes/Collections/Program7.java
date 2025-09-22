import java.util.*;
class Demo {
	int x;
	Demo(int x) {
		this.x = x;
	}
	public String toString() {
		return x+" ";
	}
}
class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(new Demo(10));
		v.addElement(new Demo(20));
		v.addElement(new Demo(30));
		v.addElement(new Demo(40));
		System.out.println(v);
		
	}
}

//[10 , 20 , 30 , 40 ]
