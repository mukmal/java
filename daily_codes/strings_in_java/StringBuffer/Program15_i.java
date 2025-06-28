class Demo{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Shashi");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());
	}
}

//Shashi
//2060468723
//22


//Capacity is 22 because the initial string is of 6 char and the StringBuffer given 16 combines and becomes 22
