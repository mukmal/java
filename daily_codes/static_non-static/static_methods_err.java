class Demo{
	void asach(){
		System.out.println("in asach method");
	}
	static void tasach(){
		System.out.println("in tasach method");
	}
	public static void main(String[] args){
		asach();
		tasach();
	}
}
//static_methods_err.java:9: error: non-static method asach() cannot be referenced from a static context
//                asach();
//                                ^
//                                1 error
