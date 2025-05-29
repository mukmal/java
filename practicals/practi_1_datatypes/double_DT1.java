class C2W{
	public static void main(String[] args){
	int numint='a'; //it will print ASCII value of a i.e.97
	float numfloat=numint;
	System.out.println(numfloat);
	numfloat=20.005;		// error: incompatible types: possible lossy conversion from double to float
	System.out.println(numfloat);	
	}
	
}
