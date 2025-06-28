class Demo{
	public static void main(String[] args){
		String str=new String("Shashi");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		str=str+"Bagal";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		str=str+"c2w";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));

	}
}

//Shashi
//2060468723
//ShashiBagal
//1933863327
//ShashiBagalc2w
//112810359
