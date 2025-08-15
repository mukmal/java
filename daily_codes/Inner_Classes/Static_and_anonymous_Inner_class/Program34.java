

class Parent {
	void career() {
		System.out.println("Software developer");
	}
}
class Child extends Parent {
}
class Client {
	public static void main(String[] args) {
		Parent obj = new Parent();
		//Parent obj1 = new Child();
		//Child obj2 = new Child();
		obj.career();
	}
}

//Software developer
