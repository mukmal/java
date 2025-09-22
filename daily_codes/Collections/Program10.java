import java.util.*;
class Demo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Mukesh");
		v.addElement("Sanjay");
		v.addElement("Shinde");
		v.addElement(10);
		v.addElement("Zal");
		ListIterator cursor = v.listIterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		while(cursor.hasPrevious()) {
			System.out.println(cursor.previous());
		}
	}
}

//Mukesh
//Sanjay
//Shinde
//10
//Zal
//Zal
//10
//Shinde
//Sanjay
//Mukesh
