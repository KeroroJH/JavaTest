package kro.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileMain {

	public static void main(String[] args) throws IOException {
		File fi = new File("src/test2.ai");
		File fi2 = new File("C://tika//filess");
			//System.out.println(fi.getName());
		File[] lis = fi2.listFiles();
		System.out.println(lis.length);
		for(File li : lis){
			if(li.isDirectory()){
				System.out.println("폴더다");
			}
			System.out.println(li);
		}
		
//		InputStream is = new FileInputStream("src/test2.ai");
//		int readByteNo;
//		byte[] redBytes = new byte[1024*4];
//		
//		while((readByteNo=is.read(redBytes)) != -1){
//			System.out.println(readByteNo);
//		}
//		is.close();
	}

}
