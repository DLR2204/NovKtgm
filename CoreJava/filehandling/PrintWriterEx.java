package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\December.txt");

		pw.println(1234);

		pw.println("good \n evening");

		pw.println('f');
		
		pw.println(true);

		pw.flush();

		pw.close();

		System.out.println("The data is written succcessfully");
	}

}
