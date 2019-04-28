package kro.tika.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.helpers.DefaultHandler;


public class FileUtilByWeb {
	private final Parser m_parserZip = new MimeTypeFinerInZip(new AutoDetectParser());
	
public void findMimeTypeinZip(final File file) throws IOException {
       ParseContext context = new ParseContext();
       context.set(Parser.class, m_parserZip);

       ContentHandler handler = new DefaultHandler();
       Metadata metadata = new Metadata();

       InputStream stream = TikaInputStream.get(file);
       try {
    	   m_parserZip.parse(stream, handler, metadata, context);
       } catch(IOException e) {
       } catch(Exception e) {
       	e.printStackTrace();
       } finally {
           stream.close();
       }
}
				

					


}
