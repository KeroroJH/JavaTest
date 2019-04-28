package kro.thread;

public class Thread01 extends Thread{
	String str;
	
	public Thread01(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10;i++){
			System.out.println(str);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
