/*print the countdown of days to submit the assignment*/
class While{
	public static void main(String[] args){
		int days=7;
		while(days>=0){
		if(days>0){
			System.out.println(days +" days remaining");		
		}else{
			System.out.println(days +" days assignment is overdue");
		}
		days--;
		}
		
	}	
}
