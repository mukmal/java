class Demo{
	void tasach(){
		System.out.println("in tasach method");
	}
	static void asach(){
		System.out.println("in asach method");
	}
	public static void main(String[] args){
		System.out.println("in main method");
		Demo.asach();
	}
}
//in main method
//in tasach method
