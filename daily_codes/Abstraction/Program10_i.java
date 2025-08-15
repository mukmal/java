interface Parent {
	void career();
	void marry();
}
class Child implements Parent {
	public void career() {
		System.out.println("Chayachitrakar");
	}
	public void marry() {
		System.out.println("Komal-G");
	}
}
class Client {
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.career();
		obj.marry();
	}
}
//Chayachitrakar
//Komal-G
