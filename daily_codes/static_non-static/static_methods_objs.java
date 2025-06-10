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
		Demo obj=new Demo();
		obj.asach();
		obj.tasach();
		obj.nakoch();
	}
}

//in main function
//in asach function
//in tasach function
//in nakoch function
