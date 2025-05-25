class logical{
	public static void main(String[] args){
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);		//false
		System.out.println(x||y);		//true
		System.out.println(!x);			//false
		int a=10;
		int b=12;
		System.out.println((a>b) && (a<b));		//false
		System.out.println((a>b) || (a<b));		//true
		System.out.println((++a>=b) && (a<++b));		//true
		int x1=5;
		int x2=3;
		System.out.println((x1-- <= ++x2) && (++x1 < x2--)); //first execute first bracket(x1-- <= ++x2) that is give false , means it will not check next bracket value directly fice output as false , so no execute other bracket and values increment or decrement in second bracket 
		System.out.println(x1);
	       System.out.println(x2);       // false 4 4
		int p=5;
		int q=3;	
		System.out.println((p-- <= ++q) || (++p <q--));	//in OR if first bracket is true then it will gives output direct as true , here false so execute 2nd Bracket 
		System.out.println(p);	 
		System.out.println(q);			//false 5 3	
	}
}
