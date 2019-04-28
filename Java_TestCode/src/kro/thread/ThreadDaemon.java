package kro.thread;

public class ThreadDaemon implements Runnable{
	
	@Override
	public void run() {
		while(true){
			System.out.println("Daemon is run..ing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadDaemon daemon = new ThreadDaemon();
		Thread th01 = new Thread(daemon);
		
		th01.setDaemon(true);
		th01.start();
		
		try {
			th01.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main End");

	}



}
