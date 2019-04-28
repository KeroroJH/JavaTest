package kro.tika;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class TikaSample {
	
	private final static Detector DETECTOR = new DefaultDetector( MimeTypes.getDefaultMimeTypes());
	
/*	public static String parseExample() throws IOException, SAXException, TikaException {
	    AutoDetectParser parser = new AutoDetectParser();
	    BodyContentHandler handler = new BodyContentHandler();
	    Metadata metadata = new Metadata();
	    try (InputStream stream = new FileInputStream(new File("src/test.txt"))) {
	        parser.parse(stream, handler, metadata);
	        return handler.toString();
	    }
	}*/
	

	public static void main(String[] args) throws IOException, SAXException, TikaException {
		//System.out.println(parseExample());
		System.out.println("//////////");
		
		Metadata metadata2 = new Metadata();
		//InputStream stream = new BufferedInputStream( new FileInputStream(new File("src/sam.pptx")));
		//InputStream stream = new BufferedInputStream( new FileInputStream(new File("src/test.txt")));
		//InputStream stream = new BufferedInputStream( new FileInputStream(new File("src/NewFile.jsp")));
		@SuppressWarnings("deprecation")
		TikaInputStream stream = TikaInputStream.get(new File("src/nomal.txt"));
		TikaInputStream stream2 = TikaInputStream.get(new File("src/auto2.asp"));
		TikaInputStream stream3 = TikaInputStream.get(new File("src/ReplyController.java"));
		
		
		 //byte[] buffer = new byte[stream.available()];
		 //stream.read(buffer);
		
		System.out.println(DETECTOR.detect(stream, metadata2).toString());
		System.out.println(DETECTOR.detect(stream2, metadata2).toString());
		System.out.println(DETECTOR.detect(stream3, metadata2).toString());
		

		
	}

}
