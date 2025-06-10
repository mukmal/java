class Demo{
	int x=10;
	static int y=20;
	public static void main(String[] args){
		Demo obj=new Demo();
		System.out.println(obj.x);
		System.out.println(y);//here we can also call as obj.y because of pointer to special structure in heap 
	}
}
//10
//20
