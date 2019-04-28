package kro.abstractt;

public class DecoCalculator extends Calculator{



	public DecoCalculator(int first, int second) {
		super(first, second);
	}

	@Override
	public void sum() {
		System.out.println("+"+_sum());
		
	}

	@Override
	public void avg() {
		System.out.println("/"+_avg());
		
	}


}
