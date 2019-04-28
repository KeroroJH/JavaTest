package kro.thread;

public class Thread02Exam {

	public static void main(String[] args) {
		Thread th01 = new Thread(new Thread02("=="));
		Thread th02 = new Thread(new Thread02("%%"));
		
		th01.start();
		th02.start();
		
		System.out.println("Main 종료");

	}

}
