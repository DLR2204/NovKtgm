package flowcontrol;

import java.util.Scanner;

public class IfExample {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new 	Scanner(System.in);
		
		System.out.print("Enter your name:-");
		
		String name = scan.next();
		
		System.out.print("Enter your age :- ");
		
		byte age = scan.nextByte();
		
		if(age>=18) {
			System.out.println("Your are eligible to vote");
		}
		
		else if(age<18){
			System.out.println("please enter correct value");
		}
		
//		else {
//			System.out.println("Your are not eligible to vote");
//		}
//		
		
	}

}
