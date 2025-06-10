class Demo{
	void asach(){
		System.out.println("in asach function");
	}
	void tasach(){
		System.out.println("in tasach function");
	}
	void nakoch(){
		System.out.println("in nakoch function");
	}
	public static void main(String[] args){
		System.out.println("in main function");
		asach();
		tasach();
		nakoch();
	}
}

//static_methods_err1.java:13: error: non-static method asach() cannot be referenced from a static context
//                asach();
//                ^
//static_methods_err1.java:14: error: non-static method tasach() cannot be referenced from a static context
//                tasach();
//                ^
//static_methods_err1.java:15: error: non-static method nakoch() cannot be referenced from a static context
//                nakoch();
//                ^
// 3 errors
