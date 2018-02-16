
public class Array3 {
	
	  public int maxSpan(int[] nums) {
		  if(nums.length == 0){
		    return 0;
		  }

		  int max = 1;
		  for(int j=0; j<nums.length;j++){
		    int span = 1;
		    for(int i=j+1; i<nums.length; i++){
		      if(nums[i] == nums[j]){
		       span = i-j+1;
		      }
		    }
		    if(span > max){
		      max =  span;
		    }
		  }

		  return max;
		}

	  public int maxSpan1(int[] nums) {
		  
		  if(nums.length <= 0){
		    return 0;
		  }
		  
		  int maxLength = 1;
		  for(int i=0; i<nums.length; i++){
		    int spanLength = 1;
		    for(int j=i+1; j<nums.length; j++){
		      if(nums[i] == nums[j]){
		        spanLength = j-i+1;
		      }
		    }
		    if(spanLength > maxLength){
		    maxLength = spanLength;
		    }
		  }
		  return maxLength;
		}



}
