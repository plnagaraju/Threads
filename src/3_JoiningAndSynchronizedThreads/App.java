package demo4;

import java.util.Scanner;


// Volatile Keyword 
// stop thread executing
// usage of volatile keyword
// 2 threads - main and Processor
// if use volatile keyword to stop thread then it will work on all systems
// if use non-volatile (running) it may not work in some systems

class Processor extends Thread {
	
	private volatile boolean running = true;
	
	public void run() {
		
		while(running) {
			System.out.println("Hello ");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutDown() {
		running = false;
	}
	
}

public class App {
	
	public static void main(String[] args) {
		
		
		Processor proc1 = new Processor();
		
		proc1.start();
		
		System.out.println("Press return to stop..");
		
		try (Scanner scan = new Scanner(System.in)) {
			scan.nextLine();
		}
		
		proc1.shutDown();
		
	}

}
