class Parent {
	int x=10;
	int y=20;
	Parent() {
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent {
	int x=30;
	int y=40;
	Child() {
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(super.obj.x);
		System.out.println(super.obj.y);
	}
}

//Program47.java:16: error: non-static variable super cannot be referenced from a static context
//                System.out.println(super.obj.x);
//                                   ^
//Program47.java:16: error: cannot find symbol
//                System.out.println(super.obj.x);
//                                         ^
//symbol: variable obj
//Program47.java:17: error: non-static variable super cannot be referenced from a static context
//                  System.out.println(super.obj.y);
//                                           ^
//Program47.java:17: error: cannot find symbol
//                  System.out.println(super.obj.y);
//                                     ^
//symbol: variable obj
//4 errors
