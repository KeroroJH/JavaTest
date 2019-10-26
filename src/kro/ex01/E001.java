package kro.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class E001 {
	public static void main(String[] args) throws Exception {
		String aa = "2019-02-01 09:15:04";
		String bb = "20180201091504";
		
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date firstD = sdf2.parse(aa);
				Date secondD = sdf.parse(bb);
				Long diffMil = Math.abs(firstD.getTime() - secondD.getTime());
				Long diff = TimeUnit.DAYS.convert(diffMil, TimeUnit.MILLISECONDS);
	
		System.out.println(diff);
		System.out.println(System.getProperty("os.name").toLowerCase());
		System.out.println(System.getProperty("user.home"));
	}
}
