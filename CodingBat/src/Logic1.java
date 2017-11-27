
public class Logic1 {
	
	public boolean love6(int a, int b) {
		  
		if(a == 6 || b == 6){
		  return true;
		}
		if(Math.abs(a-b)==6 || a+b==6){
		  return true;
		}
		return false;
	}
	public int greenTicket(int a, int b, int c) {
		if(a == b && b == c){
		return 20;
		}
		if(a == b || a == c || b == c){
		return 10;
		}
		return 0;
	}
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  
		  if(noDoubles){
		    if(die1 == die2){
		      
		      if(die1 == 6){
		        die1 = 1;
		        return die1 + die2;
		      }
		    
		      return die1 + die2 + 1;
		    }
		  }
		  
		  return die1 + die2;
		}


		public int maxMod5(int a, int b) {
		  if(a==b){
		    return 0;
		  }
		  if(a%5==b%5){
		    return Math.min(a,b);
		  }
		  return Math.max(a,b);
		}
		
		public static void main(String[] args){
			Logic1 myLogic = new Logic1();
			int r = myLogic.maxMod5(100, 125);
			System.out.println(r);
		}
		
}
