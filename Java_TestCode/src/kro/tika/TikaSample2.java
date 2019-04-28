package kro.tika;

import java.io.File;

import org.apache.tika.Tika;
import org.apache.tika.metadata.Metadata;

public class TikaSample2 {
	public static void main(String[] args) throws Exception {
		Metadata metadata = new Metadata();
		Tika tika = new Tika();
	//	Tika tika2 = new 
		
	    File file1 = new File("src/test.doc");
	    File file2 = new File("src/test.hwp");
	    File file3 = new File("src/images.pptx");
	//    File file = new File("src/xls.xls");

	    String mimeType = tika.detect(file1);
	    System.out.println(mimeType);
	    
	    String mimeType2 = tika.detect(file2);
	    System.out.println(mimeType2);
	    
	    String mimeType3 = tika.detect(file3);
	    System.out.println(mimeType3);
	    
	   // TikaInputStream stream = TikaInputStream.get(file3);
	   // Reader mimeType3 = tika.parse(stream, metadata);
	   // System.out.println(mimeType3);
	}
}
