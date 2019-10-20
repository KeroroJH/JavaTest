package kro.thread;

public class MusicBox {
	public synchronized void playMusicA(){
		for(int i=0; i<10;i++){
			System.out.println("A_music");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void playMusicB(){
		for(int i=0; i<10;i++){
			synchronized (this) {
				System.out.println("B_music");
			}
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void playMusicC(){
		for(int i=0; i<10;i++){
			System.out.println("C_music");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
