package string;

public class StringEx2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<11;i++) {
			System.out.println(i+".Child Thread");
		}
	}
	
	public static void main(String[] args) {
		
		StringEx2 obj = new StringEx2();
		
		Thread thread = new Thread(obj);
		
		thread.start();  //run method calling
		
		for(int i=0;i<11;i++) {
			System.out.println(i+".Main Thread");
			
			
		}
		

		
		
	}
	
	

}
