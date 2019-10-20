package kro.ex01;

public class E003 {
	
	public static void countt(){
		for(int i=0; i< 100; i++){
			System.out.println(i);
			if(i == 49){
				return;
			}
		}
	}
	
	public static void main(String[] args) {
			countt();

	}

}
