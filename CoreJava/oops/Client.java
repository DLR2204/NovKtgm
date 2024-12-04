package oops;

public class Client {
	
	public static void main(String[] args) {
		
		Calculator calculate = new CalChild();
		
		
		calculate.add(4, 86);
		
		calculate.sub(100, 50);
		
		calculate.mul(9, 100);
		
		calculate.del(100, 4);
		
	}

}
