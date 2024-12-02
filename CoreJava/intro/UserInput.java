package intro;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
	Scanner scan = new 	Scanner(System.in);
	
	System.out.print("Enter your name:-");
	
	String name = scan.next();
	
	System.out.print("Enter your age :- ");
	
	byte age = scan.nextByte();
	
	
	System.out.println("your name is :- "+ name + "\t" + "your age is :-"+age);
	
	
		
	}

}
