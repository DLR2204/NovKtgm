package oops;
class ParentA{
	
	public void display() {
		System.out.println("Im from the parent class");
	}
	public void add(int a,int b) {
		System.out.println(a*b);
	}
	
}

public class MethodOverriding extends ParentA {
	
	public static void main(String[] args) {
		
		MethodOverriding obj = new MethodOverriding();
		
		obj.display();
		
		obj.add(34, 6);
	}

	@Override
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}
