class Switch{
	public static void main(String[] args){
		int i=0;
		for(;;i++){
			switch(i){
				case i:
					System.out.print("new");
				default:
					System.out.println();
			}
		if(i==10){
			break;
		}
		}
	}
}
//error: constant expression required
//                                case i:
