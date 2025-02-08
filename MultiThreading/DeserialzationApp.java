package MultiThreading;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialzationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
	FileInputStream file=new FileInputStream("person.ser");
	ObjectInputStream in= new ObjectInputStream(file);
	person Person=(person) in.readObject();
	file.close();
	in.close();
	System.out.println("deserialzation :"+Person);
}catch(IOException | ClassNotFoundException e) {
System.out.println("Exception caught:"+e.getMessage());
}
	}

}
