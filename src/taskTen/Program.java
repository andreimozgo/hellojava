package taskTen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	private int id=1;
	private String name="Sidorov";
	private String dateOfBirth="18.07.1984";
	
	public Student(int id,String name, String dateOfBirth) {
		this.id=id;
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	public Student(){
	}
	
	public String toString() {
		return id + " " +name + " " + dateOfBirth;
	}
	
}

public class Program {

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Student sidorov = new Student(1, "Sidorov", "18.07.84");
		Student newSidorov = new Student();
		
		String path = "t.tmp";
		File f = new File(path);
		f.createNewFile();

	
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(sidorov);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		newSidorov = (Student)ois.readObject();
		System.out.println(newSidorov);
	}

}


