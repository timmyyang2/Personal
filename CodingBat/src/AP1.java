
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


}
