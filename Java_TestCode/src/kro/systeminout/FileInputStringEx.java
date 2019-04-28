package kro.systeminout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStringEx {

	public static void main(String[] args) {
		//한글주석 
		try {
			FileInputStream fi = new FileInputStream("C:/DEV/IDE/eGovFrameDev-3.7.0-64bit/workspace/Java_TestCode/src/kro/systeminout/FileInputStringEx.java");
			File outF = new File("C:/temp/temp2/copy.java");
			if(! outF.exists()){
				outF.createNewFile();
			}
			FileOutputStream fo = new FileOutputStream(outF,true);
			int readByteNo;
			byte[] buffer = new byte[1024];
			while((readByteNo = fi.read(buffer)) != -1){
				System.out.write(buffer);
				fo.write(buffer,0,readByteNo);
			}
			fo.flush();
			fi.close();
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
