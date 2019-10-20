package kro.enums;

interface FRUIT{
	int APPLE =1, PEACH = 2, BANANA = 3;
}

interface COMPANY{
	int GOOGOLE =1, APPLE = 2, ORACLE = 3;
}

public class InterfaceConst {

	public static void main(String[] args) {
		int type = FRUIT.APPLE;
			switch(type){
				case FRUIT.APPLE :
					System.out.println("Fruit_apple");
					break;
				case COMPANY.ORACLE :
					System.out.println("Company_oracle");
					break;
			}

	}

}
