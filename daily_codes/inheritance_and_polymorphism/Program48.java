class Parent1 extends Object {
	Parent1() {
		System.out.println("Parent");
	}
}
class Parent2 extends Object {
	Parent2() {
		System.out.println("Parent");
	}
}
class Child extends Parent1,Parent2 {
	Child() {
		System.out.println("Child");
	}
}
