public class Warmup2 {
	
	public Warmup2(){
	}
	
	public String stringTimes(String str, int n) {
		  
		String result = "";
	  
		for(int i = 0; i<n; i++){
			result =  result + str;
			if(result.contains("roy")){
				break;
			}
		}
//		int i = 0;
//		while (i<0){
//			result = result + str;
//			i++;
//		}
//		int i = 0;
//		do{
//			result = result + str;
//			i++;
//		} while (i<n);
		
		return result;
	}		

	int countXX(String str) {
		  if(str.length() < 2){
		    return 0;
		  }
		  int count = 0;
		  for(int i = 0; i<str.length()-1; i++){
		    String sub = str.substring(i, i+2);
		    if(sub.equals("xx")){
		      count ++;
		    }
		  }
		  return count;
		}

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

public static void main(String[] args){
	Warmup2 myWarmup2 = new Warmup2();
	System.out.println(myWarmup2.stringTimes("timothy ", 12));
}

}


