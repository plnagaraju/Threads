package InnerClassImpl_3;




public class App {
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {

			
			public void run() {
				
				for(int i=0; i<10; i++) {
					System.out.println("Hello - "+i);
				}
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				
			}
			
		});
		
		thread1.start();
		
	}


	
	
	
	
	
}
