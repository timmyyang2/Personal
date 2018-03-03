package year2015;

public class SpendingMoney {
	
	public static void buy(int money){
		int hats = 7;
		int shirts = 15;
		int jackets = 23;
		if(money <  hats){
			System.out.println("You cannot spend all your money!");
		}
	
		int hatsRemainder = 0;
		int hatsResult = 0;
		int shirtsRemainder = 0;
		int shirtsResult = 0;
		
		int jacketsRemainder = money % jackets;
		int jacketsResult = money / jackets;
		if(jacketsRemainder == 0){
			System.out.println("Jackets: "+jacketsResult);
		}else{
			shirtsRemainder = jacketsRemainder % shirts;
			shirtsResult = jacketsRemainder / shirts;
			if(shirtsRemainder == 0){
				System.out.print("Jackets: "+jacketsResult);
				System.out.println(" Shirts: "+shirtsResult);
			}else{
				hatsRemainder = shirtsRemainder % hats;
				if(hatsRemainder == 0){
					System.out.print("Jackets: "+jacketsResult);
					System.out.print(" Shirts: "+shirtsResult);
					hatsResult = shirtsRemainder / hats;
					System.out.println(" Hats: "+hatsResult);
				}
			}
		}
		int newMoney  = jacketsRemainder + 23;
		if(newMoney < money){
			buy(newMoney);
		}
		
		shirtsRemainder = money % shirts;
		shirtsResult = money / shirts;
		if(shirtsRemainder == 0){
			System.out.println("Shirts: "+shirtsResult);
		}else{
			hatsRemainder = shirtsRemainder % hats;
			if(hatsRemainder == 0){
				System.out.print("Shirts: "+shirtsResult);
				hatsResult = shirtsRemainder / hats;
				System.out.println(" Hats: "+hatsResult);
			}
		}
		
		newMoney  = shirtsRemainder + 15;
		if(newMoney < money){
			buy(newMoney);
		}
		
		
		hatsResult = money / hats;
		hatsRemainder = money % hats;
		if(hatsRemainder == 0){
			System.out.println("Hats: "+hatsResult);
		}	
		
		newMoney  = hatsRemainder + 7;
		if(newMoney < money){
			buy(newMoney);
		}
	}
	
	public static void main(String[] args){
		//buy(2415);
		buy(89);
	}

}
