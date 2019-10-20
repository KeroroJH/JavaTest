package kro.thread;

public class Thread01Exam {

	public static void main(String[] args) {
		Thread01 th01 = new Thread01("=");
		Thread01 th02 = new Thread01("%");
		
		th01.start();
		th02.start();
		
		System.out.println("Main 종료!!");

	}

}
