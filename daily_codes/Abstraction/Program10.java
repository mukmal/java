interface Parent {
	void career();
	void marry();
}
class Child implements Parent {
	void career() {
		System.out.println("Chayachitrakar");
	}
	void marry() {
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

//Program10.java:9: error: marry() in Child cannot implement marry() in Parent
//        void marry() {
//                     ^
//attempting to assign weaker access privileges; was public
//Program10.java:6: error: career() in Child cannot implement career() in Parent
//        void career() {
//             ^
//attempting to assign weaker access privileges; was public
//2 errors
