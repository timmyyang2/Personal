
public class Array2 {
	
	public int countEvens(int[] nums) {
		  int count=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i] % 2 == 0){
		      count++;
		    }
		  }
		  return count;
		}
	
	public int bigDiff(int[] nums) {
		  if(nums.length<1){
		    return 0;
		  }
		  int max = nums[0];
		  int min = nums[0];

		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] > max) max = nums[i];
		    if (nums[i] <= min) min = nums[i];
		  }
		  return max - min;
		}
	
	public int sum13(int[] nums) {
	    int count = 0;
	    for (int i = 0; i < nums.length; i++) {
	      if (nums[i] != 13) {
	        count += nums[i];
	      }else{
	        if (i<nums.length-1 && nums[i+1] != 13) {
	          count -= nums[i+1];
	        }
	      }
	    }
	    return count;
	}
	
	public boolean lucky13(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    if(nums[i] == 1 || nums[i] == 3){
		      return false;
		    }
		  }
		  return true;
		}
	
	public boolean has22(int[] nums) {
		for (int i = 0; i <= nums.length - 2; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
		        	return true;
		        }
		}
		return false;
	}
	
	public int sum67(int[] nums) {
		if(nums.length == 0){
			return 0;
		}
		int sum = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] != 6){
				sum += nums[i];
			}else{
				for(int j=i; j<nums.length; j++){
					if(nums[j] == 7){
						i = j;
						break;
					}
				}
			}
		}
		return sum;
	}
	
	public boolean sum28(int[] nums) {
		int count = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] == 2){
				count = count + 2;
		    }
		}
		return count == 8;
	}

	public boolean more14(int[] nums) {
		int one = 0;
		int four = 0;
		for(int i = 0; i<nums.length; i++){
		    if(nums[i] == 1){
		    	one++;
		    }else if(nums[i] == 4){
		    	four++;
		    }
		}
		if(one > four){
		    return true;
		}
		  return false;
	}

	public boolean only14(int[] nums) {
		for(int i=0; i<nums.length; i++){
		    if(nums[i] != 1 && nums[i] != 4){
		      return false;
		    }
		}
		return true;
	}
	
	public int[] fizzArray(int n) {
		  int[] newArray = new int[n];
		  for(int i=0;i<n;i++){
		    newArray[i] = i;
		  }
		  return newArray;
		}

	public String[] fizzArray2(int n) {
		  String[] newArray = new String[n];
		  for(int i=0;i<n;i++){
		    newArray[i] = String.valueOf(i);
		  }
		  return newArray;
		}

	public boolean no14(int[] nums) {
		  int one = 0;
		  int four = 0;
			for(int i=0;i<nums.length;i++){
				if(nums[i] == 1){
				  one++;
				}
				if(nums[i] == 4){
				  four++;
				}
			}
			if(one == 0 || four == 0){
			  return true;
			}
			return false;
		}
	
	public boolean no14_1(int[] nums) {
		  boolean one = false;
		  boolean four = false;
			for(int i=0;i<nums.length;i++){
				if(nums[i] == 1){
				  one = true;
				}
				if(nums[i] == 4){
				  four = true;
				}
			}
			if(one == false || four == false){
			  return true;
			}
			return false;
		}

	public boolean isEverywhere(int[] nums, int val) {
		  for(int i=0;i<nums.length-1;i++){
		    if(nums[i] != val && nums[i+1] != val){
		      return false;
		    }
		  }
		  return true;
		}
	
	public boolean either24(int[] nums) {
		  int two = 0;
		  int four = 0;
			for(int i=0;i<nums.length-1;i++){
				if(nums[i] == 2 && nums[i+1] == 2){
				  two++;
				}
				if(nums[i] == 4 && nums[i+1] == 4){
				  four++;
				}
			}
				if(two != 0 && four != 0){
				  return false;
			}
			if(two != 0 || four != 0){
			  return true;
			}
			return false;
		}

	public boolean has77(int[] nums) {
		  for(int i=0;i<nums.length-2;i++){
		    if((nums[i] == 7 && nums[i+1] == 7) || (nums[i] == 7 && nums[i+2] == 7)){
		      return true;
		    }
		    if(nums[nums.length-1] == 7 && nums[nums.length-2] == 7){
		      return true;
		    }
		  }
		  return false;
		}
	
	public boolean has12(int[] nums) {
		  boolean one = false;
		  boolean two = false;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i] == 1){
		      one = true;
		    }
		    if(nums[i] == 2 && one == true){
		      two = true;
		    }
		  }
		  return two;
		}
	
	public boolean has12_2(int[] nums) {
		  for(int i=0;i<nums.length;i++){
		    if(nums[i] == 1){
		      for(int j=i;j<nums.length;j++){
		        if(nums[j] == 2){
		          return true;
		        }
		      }
		    }
		  }
		  return false;
		}

	public boolean modThree(int[] nums) {
		  if(nums.length < 3){
		    return false;
		  }
		  for(int i=0;i<nums.length-2;i++){
		    if(nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0){
		      return true;
		    }
		    if(nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0){
		      return true;
		    }
		  }
		  return false;
		}

	public boolean haveThree(int[] nums) {
		  if(nums.length < 3){
		    return false;
		  }
		  int count = 0;
		    if(nums[0] == 3){
		      count++;
		  }
		  if(nums[nums.length-1] == 3){
		      count++;
		  }
		 for(int i=1;i<nums.length-1;i++){
		    if(nums[i] == 3){
		      if(nums[i-1] != 3 && nums[i+1] != 3){
		        count++;
		      }
		    }
		  }
		  if(count == 3){
		    return true;
		  }
		  return false;
		}

	public boolean tripleUp(int[] nums) {
		  if(nums.length < 3){
		    return false;
		  }
		  for (int i =0;i < nums.length-2;i++) {
		    if ( (nums[i] + 1 == nums[i+1]) && (nums[i] + 2 == nums[i+2]) ) {
		      return true;
		    }
		  }
		  return false;
		}


	public int[] fizzArray3(int start, int end) {
		  int n = end - start;
		  int[] newArray = new int[n];
		  for (int i = 0; i < n; i++) {
		  newArray[i] = start++;
		  }
		  return newArray;
		}
	
	public boolean twoTwo(int[] nums) {
		  if(nums.length < 2){
		    if(nums.length == 0 || nums[0] != 2){
		      return true;
		    }
		    return false;
		  }
		  
		  for(int i=1;i<nums.length-1;i++){
		    if(nums[i] == 2){
		      if(nums[i+1] != 2 && nums[i-1] != 2){
		        return false;
		      }
		    }
			}
			
			if(nums[nums.length-1] == 2){
			  if(nums[nums.length-2] != 2){
			    return false;
			  }
			}
			return true;
		}
	
	public int[] shiftLeft(int[] nums) {
		  if(nums.length > 0 ){
		    int move = nums[0];
		    for(int i=0;i<nums.length-1;i++){
		      nums[i] = nums[i+1];
		    }
		    nums[nums.length-1] = move;
		  }
		  return nums;
		}

	public int[] pre4_2(int[] nums) {
		  if(nums.length<1){
		    return nums;
		  }
		  int count = 0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i] != 4){
		      count++;
		    }else{
		      break;
		    }
		  }
		  int[] numsFour = new int[count];
		  for(int i=0;i<numsFour.length;i++){
		    numsFour[i] = nums[i];
		  }
		  return numsFour;
		}

	public int[] pre4(int[] nums) {
		  if(nums.length<1){
		    return nums;
		  }
		  int count = 0;
		  for(int i=0;i<nums.length;i++){
		    if(nums[i] != 4){
		      count++;
		    }else{
		      break;
		    }
		  }
		  int[] copyTo = java.util.Arrays.copyOfRange(nums, 0, count);
		  return copyTo;
		}

	public int[] post4(int[] nums) {
		  if(nums.length<1){
				    return nums;
				  }
		    int index = 0;
		    for(int i = 0; i < nums.length; i++){
		        if(nums[i] == 4){
		          index = i;
		        }
		    }
		    int[] copyTo = java.util.Arrays.copyOfRange(nums, index+1, nums.length);
				  return copyTo;
				}
	
	public int[] withoutTen(int[] nums) {
		  if(nums.length<1){
		    return nums;
		  }
		  int copy = 0;
		  int[] copyArray = new int[nums.length];
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]!=10){
		      copyArray[copy] = nums[i];
		      copy++;
		    }
		  }
		  return copyArray;
		}
	
	public int[] zeroMax(int[] nums) {
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]==0){
		        int max = 0;
		      for(int j=i+1;j<nums.length;j++){
		        if(nums[j]%2!=0 && nums[j]>max){
		          max = nums[j];
		        }
		      }
		      nums[i] = max;
		    }
		  }
		  return nums;
		}
	
	public boolean sameEnds(int[] nums, int len) {
		  int count=0;
		  for(int i=0;i<len;i++){
		    if(nums[i]==nums[nums.length-len+i]){
		      count++;
		    }
		  }
		  return count == len;
		}

	public int[] evenOdd(int[] nums) {
		  for(int i=0;i<nums.length;i++){
		    if(nums[i]%2==0){
		      for(int j=0;j<i;j++){
		        if(nums[j]%2!=0){
		          int temp = nums[j];
		          nums[j] = nums[i];
		          nums[i] = temp;
		          break;
		        }
		      }
		    }
		  }
		  return nums;
		}
	
	public int matchUp(int[] nums1, int[] nums2) {
		  int count = 0;
		  for(int i=0;i<nums1.length;i++){
		    if(nums1[i]-nums2[i]<=2 && nums2[i]-nums1[i]<=2 && nums1[i]!=nums2[i]){
		      count++;
		    }
		  }
		  return count;
		}

	

}

