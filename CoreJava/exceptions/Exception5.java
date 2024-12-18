package exceptions;

class AgeNotValidException extends Exception{
	
	private int age;
	
	public AgeNotValidException(int age) {
		this.age = age;
	}
	
}

public class Exception5 {
	
	public static void valid(int age) throws AgeNotValidException {
		
		if(age<18) {
			throw new AgeNotValidException(age);
		}
		
		else {
			System.out.println("You are eligible to vote");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		try {
			valid(12);
		} catch (AgeNotValidException e) {
			System.out.println("Age must be greater than 18");
			e.printStackTrace();
		}
	}
}
