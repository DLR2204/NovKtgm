package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(1234);
		
		bw.newLine();
		
		bw.write("good \n evening");
		
		bw.newLine();
		
		bw.write('f');
		
		bw.flush();
		
		bw.close();
		
		System.out.println("The data is written succcessfully");
	}

}
