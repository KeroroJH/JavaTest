package kro.cmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdProcess {

	public static void main(String[] args) throws IOException, InterruptedException {
		String[] cmdPre = { "/bin/sh", "-c", "ls -l | grep test | grep testfile" };
		//실행 후 결과 보고 선택
		//cmdPre = String.format("%s %s %s %s","tar -xvf",savedFile.getPath(),"-C",extTempPath);
		Process p=Runtime.getRuntime().exec(cmdPre);
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
