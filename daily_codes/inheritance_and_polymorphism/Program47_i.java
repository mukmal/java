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
		System.out.println(super.x);
		System.out.println(super.y);
	}
	public static void main(String[] args) {
		Child obj = new Child();
		//System.out.println(obj.super.x);
		//System.out.println(obj.super.y);
	}
}
