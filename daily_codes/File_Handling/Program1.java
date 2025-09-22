import java.io.*;
class FileDemo {
	public static void main(String[] args) throws IOException {
		File fObj = new File("Incubators.txt");
		fObj.createNewFile();			//this method is nonstatic so we need to create object of that class 
		System.out.println(fObj);		//this will return pathname of that object
		File dirObj = new File("FileDemo_Folder");
		dirObj.mkdir();
		File fObj2 = new File(dirObj,"Inside_Folder");
		fObj2.mkdir();
		File fObj3 = new File(fObj2,"xyz.txt");
		System.out.println(fObj3);
		fObj3.createNewFile();
	}	
}
