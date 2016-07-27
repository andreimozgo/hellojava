package taskTen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hello {
	public static void main(String[] args)  throws IOException, ClassNotFoundException {
		String str= new String();

		String path = "serial.txt";
		File f = new File(path);
		f.createNewFile();

/*		try {
			
			fileInputStream = new FileInputStream(path);
			} catch (FileNotFoundException e) {
			System.out.print("File not found");




			}

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		a = (A) ois.readObject();
		System.out.println("After: " + a);*/
	}
}


