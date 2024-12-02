package intro;

public class MethodEx {
	
	public String display() {   //String-dynamic
		
		return "Hi Everyone";
	}
	
	public  static int add(int a,int b) { //int-static
		return (a+b);
	}
	
	
	public void hello() {   //void-dynamic
		System.out.println("Helloo....Good Evening");
	}
	  
	public static void main(String []args) {   //void-static
	
		MethodEx obj = new MethodEx();
		
		System.out.println(obj.display());
		
		System.out.println(add(3, 7));
		
		obj.hello();
		
		
	}

	
}
