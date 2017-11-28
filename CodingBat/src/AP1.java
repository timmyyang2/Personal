import java.awt.List;
import java.util.ArrayList;

public class AP1 {

	public boolean scoresIncreasing(int[] scores) {
		  for(int i=0;i<scores.length-1;i++){
		    if(scores[i] > scores[i+1]){
		      return false;
		    }
		  }
		  return true;
		}
	
	public boolean scores100(int[] scores) {
		  for(int i=0;i<scores.length-1;i++){
		    if(scores[i] == scores[i+1]){
		      return true;
		    }
		  }
		  return false;
		}
	
	public int wordsCount(String[] words, int len) {
		  int count = 0;
		  for(int i=0;i<words.length;i++){
		    if(words[i].length() == len){
		      count++;
		    }
		  }
		  return count;
		}

	public boolean scoresClump(int[] scores) {
		  if(scores.length<3){
		    return false;
		  }
				  for(int i=0;i<scores.length-2;i++){
				    if(scores[i]+2>=scores[i+1] && scores[i]+2>=scores[i+2]){
				      return true;
				    }
				  }
				  return false;
				}

	public String[] wordsFront(String[] words, int n) {
		  return java.util.Arrays.copyOfRange(words, 0, n);
		}
	
	public ArrayList<String> wordsWithoutList(String[] words, int len) {
		  ArrayList<String> wordsList = new ArrayList<String>();
		  for(int i=0;i<words.length;i++){
		    if(words[i].length()!=len){
		      wordsList.add(words[i]);
		    }
		  }
		  return wordsList;
		}

	public boolean hasOne(int n) {
		  String one = Integer.toString(n);
		  return one.contains("1");
		}
	
	public boolean hasOne1(int n) {
		  do{
		    int result = n/10;
		    int remainder = n%10;
		    if(remainder == 1){
		      return true;
		    }else{
		      n = result;
		    }
		  }while(n != 0);
		  return false;
		}
	
	public boolean hasOne2(int n) {
		  while(n%10!=0||n/10>0){
		    if(n%10==1){
		      return true;
		    }else{
		      n = n / 10;
		    }
		  }
		  return false;
		}

	public int[] copyEvens(int[] nums, int count) {
  int index = 0;
  int[] even = new int[count];
  for(int i=0;i<nums.length;i++){
    if(nums[i]%2==0 && index<count){
      even[index] = nums[i];
      index++;
    }
  }
  return even;
}

}
