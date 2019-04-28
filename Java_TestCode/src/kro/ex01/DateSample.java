package kro.ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample {
	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		SimpleDateFormat simd = new SimpleDateFormat("MM/dd HH:mm");
		SimpleDateFormat simd2 = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat simd3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nTime = simd.format(date);
		//Calendar cal = Calendar.getInstance();
		//cal.setTime(date);  // 10분 더하기
		//cal.add(Calendar.MINUTE, 10);
		//String nTime10m = simd.format(cal.getTime());  
		Date sseionST = simd3.parse("2019-02-05 10:53:54");
		
		System.out.println(nTime);
		System.out.println(sseionST);
	}

}
