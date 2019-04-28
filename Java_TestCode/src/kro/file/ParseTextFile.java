package kro.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParseTextFile {

	public static void main(String[] args) throws IOException {
		FileReader input = new FileReader("C://parking//dbconn.pom");
		BufferedReader bufRead = new BufferedReader(input);
		String url =  bufRead.readLine().replace("URL=","");
		String user =  bufRead.readLine().replace("USER=","");
		String pw =  bufRead.readLine().replace("PW=","");
		bufRead.close();
		System.out.println(url);
		System.out.println(user);
		System.out.println(pw);
	}
}

