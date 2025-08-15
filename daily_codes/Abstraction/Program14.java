interface MacD {
	void burger();
	void fries();
	void revenue();
}
class SinhgadMacD implements MacD {
	public void burger() {
		System.out.println("Making Burger");
	}
	public void fries() {
		System.out.println("Making fries");
	}
	public void revenue() {
		System.out.println("1Cr");
	}
}
class DhayriMacD implements MacD {
	public void burger() {
		System.out.println("Making Burger");
	}
	public void fries() {
		System.out.println("Making fries");
	}
	public void revenue() {
		System.out.println("1.5Cr");
	}
}
class PetrolMacD implements MacD {
	public void burger() {
		System.out.println("Making Burger");
	}
	public void fries() {
		System.out.println("Making fries");
	}
	public void revenue() {
		System.out.println("2Cr");
	}
}

//no-error
