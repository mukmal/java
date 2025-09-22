import java.util.*;
class Demo {
	public static void main(String[] args) {
		SortedSet ss = new TreeSet();
		ss.add(10);
		ss.add("Rahul");
		System.out.println(ss);
	}
}

//Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//        at java.base/java.lang.String.compareTo(String.java:140)
//                at java.base/java.util.TreeMap.put(TreeMap.java:814)
//                        at java.base/java.util.TreeMap.put(TreeMap.java:534)
//                                at java.base/java.util.TreeSet.add(TreeSet.java:255)
//                                        at Demo.main(Program15.java:6)
