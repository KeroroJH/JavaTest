package kro.abstractt;

public class Deco2Calculator extends Calculator{

	public Deco2Calculator(int first, int second) {
		super(first, second);
	}

	@Override
	public void sum() {
		System.out.println("sum : "+_sum());
		
	}

	@Override
	public void avg() {
		System.out.println("avg : "+_avg());
		
	}
	
	
}
