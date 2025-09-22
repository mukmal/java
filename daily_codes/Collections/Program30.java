import java.util.*;
class Demo {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(18,"Virat");
		tm.put(1,"Ashish");
		tm.put(19,"Kanha");
		tm.put(32,"Rahul");
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		//System.out.println(tm.getCeilingEntry(19));
	}
}


//{1=Ashish, 18=Virat, 19=Kanha, 32=Rahul}
//1
//32
