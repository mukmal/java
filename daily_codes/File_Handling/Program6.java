import java.io.*;
class Employee implements Serializable {
	int empId;
	String empName;
	Employee (int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
	}
}
class SerialDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("EmployeeData.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee obj1 = new Employee(1,"MK");
		Employee obj2 = new Employee(2,"KM");
		oos.writeObject(obj1);
		oos.writeObject(obj2);
		oos.close();
		fos.close();
	}
}
class DeserialDemo {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		FileInputStream fis = new FileInputStream("EmployeeData.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee fileObj1 = (Employee) ois.readObject();
		Employee fileObj2 = (Employee) ois.readObject();
		System.out.println(fileObj1.empId);
		System.out.println(fileObj1.empName);
		System.out.println(fileObj2.empId);
		System.out.println(fileObj2.empName);
	}	
}
