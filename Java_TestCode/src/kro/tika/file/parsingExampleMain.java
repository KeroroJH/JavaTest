package kro.tika.file;


public class parsingExampleMain {

	public static void main(String[] args) {
		ParsingExample pex = new ParsingExample();
		
		try {
			System.out.println(pex.parseNoEmbeddedExample());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
