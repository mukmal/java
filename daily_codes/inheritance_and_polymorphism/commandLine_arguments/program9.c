#include<stdio.h>
void main(int argc ,char* argv[]) {
	for(int i=0;i<argc;i++) {
		printf("%s\n",argv[i]);
	}	
}

//mukesh@DESKTOP-MNCGO64:~/java/daily_codes/inheritance_and_polymorphism/commandLine_arguments$ ./a.out Mukesh Mukmal Komal 2709 14-2
//./a.out
//Mukesh
//Mukmal
//Komal
//2709
//14-2
