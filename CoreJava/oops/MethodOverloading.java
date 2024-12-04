package oops;

public class MethodOverloading {
	
	
	public void add(int a,int b) {
		System.out.println("7.The sum of 2 int's is :-"+(a+b));
	}
	
	public void add(int a,int b,int c) {
		System.out.println("11.The sum of 3 int's is :-"+(a+b+c));
	}
	
	public void add(float a,int b) {
		System.out.println("15.The sum of float,int is :-"+(a+b));
	}
	
	public void add(int a,float b) {
		System.out.println("19.The sum of int,float is :-"+(a+b));
	}
	
	public void add(float a,float b) {
		System.out.println("23.The sum of 2 float's is :-"+(a+b));
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		
		obj.add(3f, 7f);
		
		
		
		
	}

}
