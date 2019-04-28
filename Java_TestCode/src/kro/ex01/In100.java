package kro.ex01;

public class In100 {
	public static boolean is(int x){
		return (0 <= x && x <= 100);
	}
	
	
	
	public void countt(){
		for(int i=0; i< 100; i++){
			System.out.println(i);
			if(i == 49){
				return;
			}
		}
	}
}
