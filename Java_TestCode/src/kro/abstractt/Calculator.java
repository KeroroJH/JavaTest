package kro.abstractt;

 abstract class Calculator {

	int first,second;
	
	 Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	 void run(){
		sum();
		avg();
	}
	
	int _sum(){
		return this.first + this.second;
	}
	int _avg(){
		return this.first / this.second;
	}
	
	 abstract void sum();
	 abstract void avg();
	
	
}
