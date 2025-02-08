package MultiThreading;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person o=new person("sreedhar",24);
try {
FileOutputStream file=new FileOutputStream("person.ser");
ObjectOutputStream out=new ObjectOutputStream(file);
out.writeObject(o);
out.close();
file.close();
System.out.println("Output is serialzed");
}catch(IOException e) {
	System.out.println("Exception caught:"+e.getMessage());
}

	
	
	}

}
