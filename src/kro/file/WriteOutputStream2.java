package kro.file;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteOutputStream2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src/keroro2.txt");
		byte[] data = "ABC".getBytes();
		os.write(data);

		os.flush();
		os.close();
	}

}
