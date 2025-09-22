import java.util.*;
class Demo {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("D","Amazon");
		m.put("A","Microsoft");
		m.put("C","Apple");
		m.put("B","Google");
		m.put("E","Google");

		System.out.println(m);
		m.remove("C");
		System.out.println(m);
		System.out.println(m.get("B"));
		System.out.println(m.containsKey("C"));
		System.out.println(m.containsValue("Google"));
		System.out.println("Amazon".equals(m.get("D")));
		System.out.println(m.putIfAbsent("F","Finoix"));		
		System.out.println(m);
		m.replace("A","XYZ");
		System.out.println(m);
		System.out.println(m.isEmpty());
		m.clear();
		System.out.println(m);
	}
}

//{A=Microsoft, B=Google, C=Apple, D=Amazon, E=Google}
//{A=Microsoft, B=Google, D=Amazon, E=Google}
//Google
//false
//true
//true
//null
//{A=Microsoft, B=Google, D=Amazon, E=Google, F=Finoix}
//{A=XYZ, B=Google, D=Amazon, E=Google, F=Finoix}
//false
//{}
