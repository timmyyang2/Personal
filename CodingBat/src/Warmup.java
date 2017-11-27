
public class Warmup {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		  if (!weekday || vacation) {
		    return true;
		  }
		  
		  return false;
		  
		  // Solution notes: better to write "vacation" than "vacation == true"
		  // though they mean exactly the same thing.
		  // Likewise "!weekday" is better than "weekday == false".
		  // This all can be shortened to: return (!weekday || vacation);
		  // Here we just put the return-false last, or could use an if/else.
		}
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  if (aSmile && bSmile) {
		    return true;
		  }
		  if (!aSmile && !bSmile) {
		    return true;
		  }
		  return false;
		  // The above can be shortened to:
		  //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
		  // Or this very short version (think about how this is the same as the above)
		  //   return (aSmile == bSmile);
		}
	public int sumDouble(int a, int b) {
		  // Store the sum in a local variable
		  int sum = a + b;
		  
		  // Double it if a and b are the same
		  if (a == b) {
		    sum = sum * 2;
		  }
		  
		  return sum;
		}
	public int diff21(int n) {
		  if (n <= 21) {
		    return 21 - n;
		  } else {
		    return (n - 21) * 2;
		  }
		}
	public boolean parrotTrouble(boolean talking, int hour) {
		  
		  if(talking && (hour < 7 || hour > 20)){
		    return true;
		  }else{
		    return false;
		  }
		}
	public boolean makes10(int a, int b) {
		  if(a == 10 || b == 10 || a + b == 10){
		    return true;
		  }else{
		    return false;
		  }
		}
	public boolean nearHundred(int n) {
		  
		  if(n >= 90 && n <= 110 || n >= 190 && n <= 210){
		    return true;
		  }else{
		    return false;
		  } 
		}
	public boolean posNeg(int a, int b, boolean negative) {
		  if((a < 0 && b > 0 || a > 0 && b < 0) && !negative){
		    return true;
		  }
		  
		  if(negative == true && a < 0 && b < 0){
		    return true;

		  }else{
		    return false;
		  }
		    
		  }
	public String notString(String str) {
		  if(str.startsWith("not")){
		    return str;
		  }else{
		    
		    return "not "+str;
		  }
		  
		}
	public String missingChar(String str, int n) {

		  String first = str.substring(0, n);
		  String second =str.substring(n+1, str.length());
		  
		  return first + second;
		  
		}
	public boolean stringE(String str) {
		  int sumE = 0;
		  for(int i=0; i<str.length(); i++){
		    if(str.charAt(i) == 'e'){
		      sumE ++;
		    }
		  }
		  return sumE >= 1 && sumE <= 3;
		}
	public int close10(int a, int b) {
		  int deltaA = 10 - a;
		  int deltaB = 10 - b;
		  int absValueA = Math.abs(deltaA);
		  int absValueB = Math.abs(deltaB);
		  if(absValueA > absValueB){
		    return b;
		  }else if(absValueA < absValueB){
		    return a;
		  }else{
		    return 0;
		  }
		}
	public String everyNth(String str, int n) {
		  String newStr = "";
		  for(int i = 0; i < str.length(); i = i + n){
		    newStr = newStr + str.charAt(i);
		  }
		  return newStr;
		}


	
	public static void main(String[] args){
		
		
	}
}
