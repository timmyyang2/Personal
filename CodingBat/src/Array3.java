
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
	  
	  public int[] fix34(int[] nums) {
		    for(int i=0; i<nums.length; i++){
		        if(nums[i]==3){
		          int temp = nums[i+1];
		          nums[i+1] = 4;
		          for(int j=i+2; j<nums.length; j++){
		                if(nums[j] == 4){
		                  nums[j] = temp;
		                }
		          }
		        }
		      }
		    return nums;
		}
	  
	  public int[] fix45(int[] nums) {
		    for(int i=0; i<nums.length; i++){
		        if(nums[i]==4){
		          int temp = nums[i+1];
		          nums[i+1] = 5;
		          for(int j=i+2; j<nums.length; j++){
		                if(nums[j] == 5){
		                  nums[j] = temp;
		                }
		          }
		        }
		      }
		    return nums;
		}

}
