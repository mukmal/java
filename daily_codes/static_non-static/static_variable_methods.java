class Demo{
	int x=30;
	static int y=40;
	void tasach(){
		System.out.println("in tasach function");
	}
	static void asach(){
		System.out.println("in asach function");
	}
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println(obj.x);
		System.out.println(y);	// 	obje.y	also right
		obj.tasach();		
		asach();		//	obj.asach	
	}
}

//10
//40
//in tasach function
//in asach function
