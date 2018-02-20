
public class String3 {
	
	public int countYZ(String str) {
		  int count = 0;
		  str = str.toLowerCase() + " ";
		  for(int i=0; i<str.length(); i++){
		    if(str.charAt(i) == 'y' || str.charAt(i) == 'z'){
		      if(!Character.isLetter(str.charAt(i+1))){
		      count++;
		      }
		    }
		  }
		  return count;
		}
	
	public boolean equalIsNot(String str) {
		  int not = 0;
		  int is = 0;
		  for(int i=0; i<str.length()-2; i++){
		    if(str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 't'){
		      not++;
		    }
		  }
		  for(int j=0; j<str.length()-1; j++){
		      if(str.charAt(j) == 'i' && str.charAt(j+1) == 's'){
		        is++;
		      }
		    }
		  if(not == is){
		    return true;
		  }
		  return false;
		}

	public boolean gHappy(String str) {
		  boolean temp = true;
		  if(str.length() == 1 && str.charAt(0) == 'g'){
		    return false;
		  }
		  if(str.length() == 0){
		    return true;
		  }
		  for(int i=1; i<str.length(); i++){
		    if(str.charAt(i) == 'g'){
		      if(!(str.charAt(i-1) == 'g')){
		        temp = false;
		      }
		      if(i<str.length()-1 && str.charAt(i+1) == 'g'){
		        temp = true;
		      }
		    }
		  }
		  return temp;
		}

	public int countTriple(String str) {
		  int count = 0;
		  for(int i=0; i<str.length()-2; i++){
		    if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)){
		      count++;
		    }
		  }
		  return count;
		}

	public int sumDigits(String str) {
		  int count = 0;
		  for(int i=0; i<str.length(); i++){
		    if(Character.isDigit(str.charAt(i))){
		      String str1 = String.valueOf(str.charAt(i));
		      int num = Integer.parseInt(str1);
		      count = count + num;
		    }
		  }
		  return count;
		}

	public int maxBlock(String str) {
		  int count = 0;
		  for(int i=0; i<str.length(); i++){
		    int temp = 0;
		    for(int j=i; j<str.length(); j++){
		      if(str.charAt(i) == str.charAt(j)){
		        temp++;
		      }else{
		        break;
		      }
		    }
		    if(temp>count){
		      count = temp;
		    }
		  }
		  return count;
		}
}
