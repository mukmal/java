class Parent {
	int x=10;
	int y=20;
	Parent() {
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent {
	Child() {
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(x);
		System.out.println(y);
	}
}

//Program45.java:14: error: non-static variable x cannot be referenced from a static context
//                System.out.println(x);
//                                   ^
//Program45.java:15: error: non-static variable y cannot be referenced from a static context
//                System.out.println(y);
//                                   ^
//2 errors
