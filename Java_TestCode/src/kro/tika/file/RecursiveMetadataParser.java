package kro.tika.file;

import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.detect.DefaultDetector;
import org.apache.tika.detect.Detector;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MimeTypes;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.ParserDecorator;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

class RecursiveMetadataParser extends ParserDecorator {
	private final Detector DETECTOR = new DefaultDetector( MimeTypes.getDefaultMimeTypes());
       public RecursiveMetadataParser(Parser parser) {
           super(parser);
       }

       @Override
       public void parse(
               InputStream stream, ContentHandler ignore,
               Metadata metadata, ParseContext context)
               throws IOException, SAXException, TikaException {
    	   System.out.println("-- parse--S1");
           ContentHandler content = new BodyContentHandler(500*1024*1024);
    	   System.out.println("-- parse--S2");
           super.parse(stream, content, metadata, context);
    	   System.out.println("-- parse--S");
           String ftype = DETECTOR.detect(stream, metadata).toString();
           System.out.println("-- parse--  " + ftype);
           System.out.println("-- parse--E");
           }
    	   
       }
     
     




