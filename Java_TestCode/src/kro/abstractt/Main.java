package kro.abstractt;

public class Main {

	public static void main(String[] args) {
		DecoCalculator cal = new DecoCalculator(500, 100);
		cal.run();
		
		Deco2Calculator cal2 = new Deco2Calculator(500, 100);
		cal2.run();

	}

}
