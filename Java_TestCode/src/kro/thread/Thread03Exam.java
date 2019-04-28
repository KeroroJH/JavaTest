package kro.thread;

public class Thread03Exam {

	public static void main(String[] args) {
		Thread03NotifyWait thWait = new Thread03NotifyWait();
		Thread th01 = new Thread(thWait);
		
		
		th01.start();
		
		synchronized (th01) {
			try {
				System.out.println("wait");
				th01.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("total :"+thWait.total);
		}


	}

}
