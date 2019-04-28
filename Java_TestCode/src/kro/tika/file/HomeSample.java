package kro.tika.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import org.apache.tika.Tika;
import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class HomeSample {

	public String parseToStringExample(File file) throws IOException, SAXException, TikaException {
	    Tika tika = new Tika();
	    try (InputStream stream = TikaInputStream.get(file)) {
	        return tika.parseToString(stream);
	    }
	}
	
	public String parseExample(File file) throws IOException, SAXException, TikaException {
	    AutoDetectParser parser = new AutoDetectParser();
	    BodyContentHandler handler = new BodyContentHandler();
	    Metadata metadata = new Metadata();
	    try (InputStream stream = TikaInputStream.get(file)) {
	        parser.parse(stream, handler, metadata);
	        return handler.toString();
	    }
	}
	
	public String parseToPlainText(File file) throws IOException, SAXException, TikaException {
	    BodyContentHandler handler = new BodyContentHandler();
	 
	    AutoDetectParser parser = new AutoDetectParser();
	    Metadata metadata = new Metadata();
	    try (InputStream stream = TikaInputStream.get(file)) {
	        parser.parse(stream, handler, metadata);
	        return handler.toString();
	    }
	}

	
	public String getFullText(File file) throws IOException, SAXException, TikaException {
	    StringWriter writer = new StringWriter();
	    
	    final TikaInputStream inputStream =  TikaInputStream.get(file);
	    try {
	        final Detector detector = new DefaultDetector();
	        final Parser parser = new AutoDetectParser(detector);

	        final Metadata metadata = new Metadata();
	        final ParseContext parseContext = new ParseContext();
	        parseContext.set(Parser.class, parser);

	        
	        BodyContentHandler contentHandler = new BodyContentHandler(writer);
	        parser.parse(inputStream, contentHandler, metadata, parseContext);
	    }
	    finally {
	        inputStream.close();
	    }
	    
	    return writer.toString();
	}
}
