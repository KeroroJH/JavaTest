package kro.enums;

enum Fruits{
	APPLE("red") , PEACH("pink") , BANANA("yellow");
	private String color;
	public String getColor(){
		return this.color;
	}
	Fruits(String color){
		this.color = color;
		System.out.println("Call_Construtor "+this+" color : "+this.color);
	}
}

enum Companys{
	GOOGOLE, APPLE, ORACLE;
}

public class EnumMain {

	public static void main(String[] args) {
		Fruits type = Fruits.APPLE;
			switch(type){
				case APPLE :
					System.out.println("company_apple :"+Fruits.APPLE.getColor());
					break;
				case BANANA :
					System.out.println("Company_oracle"+Fruits.BANANA.getColor());
					break;
			}
		//values() 열거형에 있는 항목을 담은 유사배열	
		for(Fruits f : Fruits.values()){
			System.out.println(f);
		}
	}

}
