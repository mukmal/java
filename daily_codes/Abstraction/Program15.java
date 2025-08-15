interface MacD {
	default public void burger() {
		System.out.println("Making burger");
	}
	default public void fries() {
		System.out.println("Making fries");
	}
	void revenue();
}
class Sinhgad implements MacD {
	public void revenue() {
		System.out.println("1cr");
	}
}

//no-error
