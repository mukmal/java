/*grading*/
class Switch{
	public static void main(String[] args){
		char grade='A';
		char F='F';
		switch(grade){
			case 'A':
				System.out.println("First class");
				break;
			case 'B':
				System.out.println("Second class");
				break;
		}
		if(grade==F){
		System.out.println("Sorry ,you are fail");
		} 
	}
}
