package oops;

interface Parent1 {

	public void display();

	public int add(int a, int b);

}

interface Parent2 {
	public void hi();

	public int add(int a, int b);

}

public class Child1 implements Parent1, Parent2 {

	@Override
	public void hi() {
		System.out.println("Im from Parent2 interface");
	}

	@Override
	public void display() {
		System.out.println("Im from Parent1 interface");
	}

	@Override
	public int add(int a, int b) {

		return (a+b);
	}

	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.hi();
		
		obj.display();
		
		System.out.println(obj.add(25, 9));
	}
}
