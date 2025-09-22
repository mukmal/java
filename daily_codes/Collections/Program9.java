import java.util.*;
class Demo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Mukesh");
		v.addElement("Sanjay");
		v.addElement("Shinde");
		v.addElement("Bs");
		v.addElement("Zal");
		Iterator cursor = v.iterator();
		while(cursor.hasNext()) {
			if("Shinde"==cursor.next()) {
				cursor.remove();
			}
		}
		System.out.println(v);
	}
}

//[Mukesh, Sanjay, Bs, Zal]
