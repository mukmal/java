/*output*/
class c2w{
	public static void main(String[] args){
		int x=10;
		int y=11;
		System.out.println((++x>=y)&&(x<++y));//true 
		System.out.println(x);//11
		System.out.println(y);//12
		x=15;
		y=35;

		System.out.println(x&y);
		System.out.println(x|y);
	}
}
