package kro.thread;

public class MusicPlayer extends Thread{
	int type;
	MusicBox musicbox;
	
	public MusicPlayer(int type, MusicBox musicbox) {
		this.type = type;
		this.musicbox = musicbox;
	}

	@Override
	public void run() {
		switch(type){
		case 1 : musicbox.playMusicA();
			break;
		case 2 : musicbox.playMusicB();
			break;
		case 3 : musicbox.playMusicC();
				 notify();
			break;
		}
	}
	
	
}
