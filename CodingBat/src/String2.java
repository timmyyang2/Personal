
public class String2 {
	public int countHi(String str) {
		  int count = 0;
		  for(int i=0; i<str.length()-1; i++){
		    if(str.substring(i, i+2).equals("hi")){
		      count++;
		    }
		    }
		  return count;
		}
	public boolean catDog(String str) {

		  if(str.length()<3){
		    return true;
		  }
		  int cat = 0;
		  int dog = 0;
		  for(int i=0; i<str.length()-2; i++){
		    if(str.substring(i, i+3).equals("cat")){
		      cat++;
		    }
		      if(str.substring(i, i+3).equals("dog")){
		        dog++;
		      }
		    }
		  return cat == dog;
		}
	public int countCode(String str) {
		  if(str.length()<4){
		   return 0;
		  }
		  int count = 0;
		  for(int i=0; i<str.length()-3; i++){
		    String eva = str.substring(i, i+4);
		    String eva_1 = eva.substring(0, 2);
		    char eva_3 = eva.charAt(3);
		    if(eva_1.equals("co") && eva_3 == ('e')){
		      count++;
		    }
		  }
		  return count;
		}

	public boolean endOther(String a, String b) {
		  String al = a.toLowerCase();
		  String bl = b.toLowerCase();
		  return al.endsWith(bl) || bl.endsWith(al);
		}
	public boolean xyzThere(String str) {
		  if(str.length()<3){
		    return false;
		  }
		  if(str.startsWith("xyz")){
		    return true;
		  }
		  
		  for(int i=0; i<str.length()-3; i++){
			    String eva = str.substring(i, i+4);
			    String eva_1 = eva.substring(0,1);
			    String eva_2 = eva.substring(1,4);
			    if(!eva_1.equals(".") && eva_2.equals("xyz")){
			      return true;
			    }
		  }
		  return false;
		}
	
	public String doubleChar(String str) {
		  String newstr = "";
		  for(int i=0; i<str.length(); i++){
		    newstr = newstr + str.charAt(i) + str.charAt(i);
		  }
		  return newstr;
		}
	
	public boolean bobThere(String str) {
		  for(int i=0; i<str.length()-2; i++){
		    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
		    return true;
		    }
		  }
		  return false;
		}
	public boolean xyBalance(String str) {
		  for(int i=0; i<str.length(); i++){
		    if(str.charAt(i)=='x'){
		      if(!str.substring(i).contains("y")){
		        return false;
		      }
		    }
		  }
		  return true;
		}



	
	
		public static void main(String[] args){
			String2 myString = new String2();
			
			boolean r = myString.catDog("a");
			System.out.println(r);
			
			int myInt = myString.countCode("qwiuie");
			System.out.println(myInt);
			
			String myS = myString.doubleChar("qwqqww");
			System.out.println(myS);
			
			boolean r1 = myString.bobThere("bonb");
			System.out.println(r1);
			
			boolean r2 = myString.bobThere("bobthere");
			System.out.println(r2);
			
			boolean r3 = myString.xyBalance("efoioiqwdiowdqxaoiay");
			System.out.println(r3);
			
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Long.MAX_VALUE);
			System.out.println(Double.MAX_VALUE);
			  
		}

		public boolean xyzMiddle(String str) {
			  if(str.length()<3){ 
			    return false;
			  }
			  int m = str.length()/2-2;
			  int a = str.indexOf("xyz", m);     
			  int b = a + 2;
			  int c = str.length()-1-b;
			  if(Math.abs(a-c) <= 1){
			    return true;
			  }
			  return false;
		}
		
		public String getSandwich(String str) {
			  if(str.indexOf("bread")==str.lastIndexOf("bread")){
			    return "";
			  } 
			  return(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
		}

		public boolean sameStarChar(String str) {
			  for(int i=1; i<str.length()-1; i++){
			    if(str.charAt(i)=='*'){
			      if(str.charAt(i-1)!=str.charAt(i+1)){
			      return false;
			      }
			    }
			  }
			  return true;
			}
}
