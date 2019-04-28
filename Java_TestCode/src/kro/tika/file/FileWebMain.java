package kro.tika.file;

import java.io.File;

public class FileWebMain {

	public static void main(String[] args) throws Exception {
		FileUtilByWeb fu = new FileUtilByWeb();
		//fu.hasProhibitedZip(new File("src/test.ai"));
		
		fu.findMimeTypeinZip(MakeToZip.makeToZip(new File("src/test.ai")));
		fu.findMimeTypeinZip(MakeToZip.makeToZip(new File("src/testVideo.mp4")));
		


	}

}
