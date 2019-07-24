import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArraySerilizationDeserilization {

	public static void main(String[] args) {

		
		
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("sharath");
		al.add("java");
		al.add("developer");

	
	try {
		//serilization
		
		FileOutputStream fos = new FileOutputStream("file");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(al);
		fos.close();

		oos.close();
		
		
		//deserilization
		
		FileInputStream fis = new FileInputStream("file");
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		ArrayList list= (ArrayList)ois.readObject();
		
		System.out.println(list);
	}catch(Exception e) {
		
		e.printStackTrace();
	}
}}
