class Parent {
	int x=10;
	void fun() {
		System.out.println("In fun");
	}
}
class Child extends Parent {
}
class Client {
	public static void main(String[] args) {
		Parent pObj = new Parent();
		System.out.println(pObj.x);
		pObj.fun();
	}
}

//10
//In fun
