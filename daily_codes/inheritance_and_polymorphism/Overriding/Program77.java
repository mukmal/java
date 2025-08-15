class Parent {
	int fun() {
		return 10;
	}
}
class Child extends Parent {
	long fun() {
		return 10l;
	}
}
class Client {
	public static void main(String[] args ) {
	
	}
}

//Program77.java:7: error: fun() in Child cannot override fun() in Parent
//        long fun() {
//             ^
//return type long is not compatible with int
