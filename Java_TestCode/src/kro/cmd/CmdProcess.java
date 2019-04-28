package kro.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdProcess {

	public static void main(String[] args) throws IOException, InterruptedException {
		Process p=Runtime.getRuntime().exec("java -jar c://parking//park.jar");
		BufferedReader stdInput = new BufferedReader(new 
			     InputStreamReader(p.getInputStream()));
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		}
		p.waitFor();
		stdInput.close();
	}

}
