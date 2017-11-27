
public class StringTest {
	
	public String notString(String str) {
		if(str.startsWith("not")){
		    return str;
		}else{    
		    return "not "+str;
		}
	}
	
	public String yesString(String str) {
		if(str.endsWith("yes")){
			return str;
		}else{
			return str + " yes";
		}
	}
	
	public String missingChar(String str, int n) {

		String first = str.substring(0, n);
		String second =str.substring(n+1, str.length());
		  
		return first + second;
		
		
	}

	public String frontBack(String str) {
		  
		  if(str.length() <= 1){
		    return str;
		  }

		  String first = str.substring(0, 1);
		  
		  String mid = str.substring(1, str.length()-1);
		  
		  String last = str.substring(str.length()-1, str.length());
		  
		  String newString = last + mid + first;
		    return newString;
		}
	public boolean startHi(String str) {
		  
		return str.startsWith("hi");

		}
	public boolean loneTeen(int a, int b) {
		  if((a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
		      return false;
		  }
		  if((b >= 13 && b <= 19) && (a >= 13 && a <= 19)){
		      return false;
		    }
		    if(a < 13 && b < 13 || a > 19 && b > 19){
		      return false;
		    }
		    return true;
		}
	public String delDel(String str) {
		  if(str.length() > 3){
		    String delDel = str.substring(1, 4);
		    if(delDel.equals("del")){
		      String first = str.substring(0, 1);
		      String end = str.substring(4);
		      return first + end;
		    }
		  }
		  return str;
		}
	public boolean mixStart(String str) {
		  
		  if(str.length() < 3){
		    return false;
		  }
		  String two = str.substring(1, 3);
		  
		  if(two.equals("ix")){
		    return true;
		  }else{
		    return false;
		  }
		}
	public String startOz(String str) {
		  if(str.length() > 2){
		    String start = str.substring(0,2);
		    if(str.substring(0,1).equals("o") && !str.substring(1,2).equals("z")){
		      return "o";
		      
		    }
		    if(str.substring(1,2).equals("z") && !str.substring(0,1).equals("o")){
		      return "z";
		   }
		    if(!str.substring(0,1).equals("o") && !str.substring(1,2).equals("z")){
		      return "";
		  }
		  return start;
		  
		  }
		  return str;
		}
	public int intMax(int a, int b, int c) {
		  int max;
		  if(b > a){
		    max = b;
		  }else{
		  max = a;
		  }
		  if(c > max){
		    max = c;
		  }
		  return max;
		}
	public boolean in3050(int a, int b) {
		  if((a >= 30 && a <= 40) && (b >= 30 && b <= 40)){
		   return true;
		  }
		   if((a >= 40 && a <= 50) && (b >= 40 && b <= 50)){
		  return true;
		}
		  return false;
		}
	public boolean lastDigit(int a, int b) {
		  if(a % 10 == b % 10){
		    return true;
		  }
		  return false;
		}

	public int getIndexOfl(String str){
		int indexOfl = str.indexOf("l");
		return indexOfl;
	}
	public int getLastIndexOfl(String str){
		int lastIndexOfl = str.lastIndexOf("l");
		return lastIndexOfl;
	}
	public String endUp(String str) {
		  String newStr = str.toUpperCase();
		  if(str.length() < 3){
		    return newStr;
		  }
		  
		  String Front = str.substring(0, str.length()-3);
		  String End = newStr.substring(str.length()-3, str.length());
		  return Front + End;
		  
		  }


	public static void main(String[] args){
		StringTest myTest = new StringTest();
		String value = myTest.yesString("yess");
		System.out.println(value);
		String value1 = myTest.yesString("tim yes");
		System.out.println(value1);
		String value2 = myTest.notString("just doing competition for prizes not");
		System.out.println(value2);
		String value3 = myTest.notString("not mary stewart");
		System.out.println(value3);
		String value4 = myTest.missingChar("timothy", 3);
		System.out.println(value4);
		String value5 = myTest.missingChar("mawry stewart", 2);
		System.out.println(value5);
		String value6 = myTest.frontBack("yimothT");
		System.out.println(value6);
		int value7 = myTest.getIndexOfl("hello");
		System.out.println(value7);
		int value8 = myTest.getLastIndexOfl("hello");
		System.out.println(value8);
		String value9 = myTest.endUp("North Junior");
		System.out.println(value9);
	}
}

