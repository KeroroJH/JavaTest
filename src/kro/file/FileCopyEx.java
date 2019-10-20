package kro.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx {

	public static void main(String[] args) throws Exception {
		String targetFath = "c:/temp/temp2/";
		File fi = new File("c:/temp/temp1");
		File[] files = null;
		if(fi.exists()){
			files = fi.listFiles();
		}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		for(File file : files){
			if(file.isDirectory()) file.mkdir();
			fis = new FileInputStream(file);
			fos = new FileOutputStream(targetFath+file.getName());
			int byteCount;
			byte[] buffer = new byte[1024];
			while((byteCount=fis.read(buffer)) != -1){
				fos.write(buffer,0,byteCount);
			}
		}
		fos.flush();
		fos.close();
		fis.close();

	}

}
