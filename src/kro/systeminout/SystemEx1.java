package kro.systeminout;

import java.io.InputStream;

public class SystemEx1 {

	public static void main(String[] args) throws Exception{
		System.out.print("메뉴를 선택하세요");
		
		InputStream is = System.in;
		byte[] byteData = new byte[15];
		int readbyte = is.read(byteData);
		System.out.println(new String(byteData,0,readbyte));

	}

}
