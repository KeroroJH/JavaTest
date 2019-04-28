package kro.ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {

	public static void main(String[] args) {
		Date date = new Date();
		Date date2 = new Date(System.currentTimeMillis() - 600 * 1000);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		//System.out.println(sdf.format(date));
		//System.out.println(sdf.format(date2));
		
		String year = sdf.format(date);
		String sample = "04/24 12:55";
		sample = sample.replace("/", "");
		System.out.println(sample);
	}

}
