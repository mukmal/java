import java.util.*;
class Demo {
	public static void main(String[] args) {
		IdentityHashMap hm = new IdentityHashMap();
		hm.put(new Integer(10),"Ashish");
		hm.put(new Integer(10),"Kanha");
		hm.put(new Integer(10),"Badhe");
		hm.put(new Integer(10),"Rahul");
		System.out.println(hm);
	
	}
}

//{10=Ashish, 10=Kanha, 10=Rahul, 10=Badhe}
