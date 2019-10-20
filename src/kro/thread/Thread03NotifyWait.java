package kro.thread;

public class Thread03NotifyWait implements Runnable{
	int total;

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++){
				System.out.println(i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				total += i;
			}
			notify();
		}

	}
	
}
