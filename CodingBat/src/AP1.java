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

	public int[] copyEndy(int[] nums, int count) {
		  int index = 0;
				int[] endy = new int[count];
				for(int i=0;i<nums.length;i++){
					if((nums[i]>=0 && nums[i]<=10 || nums[i]>=90 && nums[i]<=100) && index<count){
						endy[index] = nums[i];
						index++;
					}
				}
				return endy;
		}
	
	public int matchUp(String[] a, String[] b) {
		  int count = 0;
		  for(int i=0; i<a.length; i++){
		    String one = a[i];
		    String two = b[i];
		    if((one.length()>0 && two.length()>0) && (a[i].charAt(0) == b[i].charAt(0))){
		      count++;
		    }
		  }
		  return count;
		}
	
	public int scoreUp(String[] key, String[] answers) {
		  int count = 0;
		  for(int i=0; i<key.length; i++){
		    if(key[i] == answers[i]){
		      count = count+4;
		    }else if(key[i] != answers[i] && answers[i] != "?"){
		      count = count-1;
		    }
		  }
		  return count;
		}

	public String[] wordsWithout(String[] words, String target) {
		  String[] temp = new String[words.length];
		  int count = 0;
		  for(int i=0; i<words.length; i++){
		    if(!words[i].equals(target)){
		      temp[count] = words[i];
		      count++;
		    }
		  }
		  String[] newWords = new String[count];
		  for(int j=0; j<count; j++){
		    newWords[j] = temp[j];
		  }
		  return newWords;
		}
	
	public int scoresSpecial(int[] a, int[] b) {
		  return largestTenMult(a) + largestTenMult(b);
		}

		private int largestTenMult(int[] array){
		  int max = 0;
		  for (int i = 0; i < array.length; i++) {
		    if (array[i] > max && array[i] % 10 == 0) {
		      max = array[i];
		    }
		  }
		  return max;
		}
		
		public int sumHeights(int[] heights, int start, int end) {
			  int max = 0;
			  for (int i = start; i <= end-1; i++) {
			    max += Math.abs(heights[i] - heights[i+1]);
			  }
			  return max;
			}
		
		public int sumHeights2(int[] heights, int start, int end) {
			  int max = 0;
			  for (int i = start; i <= end-1; i++) {
			    if(heights[i] - heights[i+1] < 0){
			     max += Math.abs(heights[i] - heights[i+1]) * 2;
			    }else{
			    max += Math.abs(heights[i] - heights[i+1]);
			    }
			  }
			  return max;
			}
		
		  public int bigHeights(int[] heights, int start, int end) {
		        int count = 0;
					  int max = 0;
					  for (int i = start; i <= end-1; i++) {
					    if(Math.abs(heights[i] - heights[i+1]) >= 5){
					     max++;
					    }else{
					    count++;
					    }
					  }
					  return max;
					}
		  
		  public int userCompare(String aName, int aId, String bName, int bId) {
			  if(aName.equals(bName)){
			    if(aId == bId){
			      return 0;
			    }else if(aId > bId){
			      return 1;
			    }else if(aId < bId){
			      return -1;
			    }
			  }
			  int name = aName.compareTo(bName);
			    if(name > 0){
			      return 1;
			  }else if(name < 0){
			    return -1;
			  }else{
			    return 0;
			  }
			}
		  
		  public int commonTwo(String[] a, String[] b) {
			  int count = 0;
			  String check = "";
			  for(int i=0; i<b.length; i++){
			    for(int j=0; j<a.length; j++){
			      if(a[j].equals(b[i]) && !check.equals(a[j])){
			        check = a[j];
			        count++;
			      }
			    }
			  }
			  return count;
			}

	
}
