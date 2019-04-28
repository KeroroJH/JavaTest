package kro.tika.file;

import java.io.File;
import java.io.IOException;

import org.apache.tika.Tika;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;

public class FileUtil {
	private Parser m_parser = new RecursiveMetadataParser(new AutoDetectParser());
	private Tika tika = new Tika();


public String detectMimeType(final File file) throws IOException {
	return tika.detect(file);
}
	
public void hasProhibitedZip(final File file) throws IOException {
       ParseContext context = new ParseContext();
       context.set(Parser.class, m_parser);

       ContentHandler handler = new DefaultHandler();
       Metadata metadata = new Metadata();
       
       TikaInputStream stream2 = TikaInputStream.get(file);
       System.out.println( TikaInputStream.isTikaInputStream(stream2));
       
       try {
        m_parser.parse(stream2, handler, metadata, context);
       } catch(IOException e) {
       } catch(Exception e) {
       	e.printStackTrace();
       } finally {
     
           stream2.close();
       }	
      
}
public void hasProhibitedZip2(final File file, Metadata metadata) throws IOException {
	ParseContext context = new ParseContext();
	context.set(Parser.class, m_parser);
	
	ContentHandler handler = new DefaultHandler();
	
	TikaInputStream stream2 = TikaInputStream.get(file);
	System.out.println( TikaInputStream.isTikaInputStream(stream2));
	
	try {
		m_parser.parse(stream2, handler, metadata, context);
	} catch(IOException e) {
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		
		stream2.close();
	}	
	
}


}
