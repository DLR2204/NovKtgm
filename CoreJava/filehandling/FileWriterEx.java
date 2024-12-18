package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");
		
		fw.write(12312);
		
		fw.write("good morning");
		
		fw.write('d');
		
		fw.flush();
		
		fw.close();
		
		System.out.println("the file is written successfully");
	}

}
