package kro.tika.file;

import java.io.File;

import org.apache.tika.metadata.Metadata;

public class Maindo {

	public static void main(String[] args) throws Exception {
		FileUtil fu = new FileUtil();
		//fu.hasProhibitedZip(new File("src/test.ai"));
		
		String dataName = "test.ai";
		Metadata meta = new Metadata();
		meta.set(Metadata.RESOURCE_NAME_KEY, dataName);
		fu.hasProhibitedZip2(new File("src/"+dataName),meta);
		
//		HomeSample hu = new HomeSample();
//		System.out.println(hu.parseExample(new File("src/testAi.zip")));
//		System.out.println(hu.parseToStringExample(new File("src/testAi.zip")));
//		System.out.println(hu.parseToPlainText(new File("src/test.ai")));
//		System.out.println(hu.getFullText(new File("src/sam.pptx")));
	}

}
