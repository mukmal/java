/*print alphabate A-Z print only consonants not vowels*/
class While{
	public static void main(String[] args){
		char ch='A'; //or ch=65;
		while(ch<='Z'){
		if(ch=='A' || ch=='E' || ch =='I' || ch == 'O' || ch == 'U'){
			ch++;
			continue;
		}else{
		System.out.print(ch+ " ");
		ch++;
		}
		}
		System.out.println();
	}
}
