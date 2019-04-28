package kro.file;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteOutputStream {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src/keroro.txt");
		byte[] data = "ABC".getBytes();
		for(int i=0; i < data.length; i++){
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}

}
