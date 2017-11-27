
public class Array1 {

	 public boolean firstLast6(int[] nums) {
		    if(nums[0]==6 || nums[nums.length-1] == 6){
		      return true;
		  }
		    return false;
		}
	 public boolean sameFirstLast(int[] nums) {
		  if(nums.length >= 1 && nums[0]==nums[nums.length-1]){
				    return true;
				  }
				    return false;
				}

	 public int[] makePi() {
		  int[] pi = {3,1,4};
		  return pi;
		}
	 
	 public boolean commonEnd(int[] a, int[] b) {
		  if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]){
		    return true;
		  }
		  return false;
		}
	 
	 public int sum3(int[] nums) {
		 return nums[0] + nums[1] + nums[2];
		 }
	 
	 public int[] rotateLeft3(int[] nums) {
		 int[] rotateLeft = { nums[1], nums[2], nums[0] };
		 return rotateLeft;
		 }
	 
	 public int[] reverse3(int[] nums) {
		  int[] reverse3 = {nums[2], nums[1], nums[0]};
		  return reverse3;
		}
	 public int[] maxEnd3(int[] nums) {
			if (nums[2] > nums[0]) {
			nums[0] = nums[2];
			nums[1] = nums[2];
			} else {
			nums[1] = nums[0];
			nums[2] = nums[0];
			}
			return nums;
			}
	 public int sum2(int[] nums) {
		 if(nums.length == 0){
		 return 0;
		 }
		 if(nums.length == 1){
		 return nums[0];
		 }
		 return nums[0] + nums[1];
		 }
	 public int[] middleWay(int[] a, int[] b) {
		  int[] c = {a[1], b[1]};
		  return c;
		}
	 public int[] makeEnds(int[] nums) {
		  int[] c = {nums[0],nums[nums.length-1]};
		  return c;
		}
	 public boolean has23(int[] nums) {
		  if((nums[0] == 2) || (nums[0] == 3) || (nums[1] == 2) || (nums[1] == 3)){
		    return true;
		  }
		  return false;
		}
	 public boolean no23(int[] nums) {
		  if((nums[0] != 2) && (nums[1] != 2) && (nums[0] != 3) && (nums[1] != 3)){
		    return true;
		  }
		  return false;
		}
	 public int[] makeLast(int[] nums) {
		 int[] num = new int[nums.length*2];
		 num[nums.length*2 - 1] = nums[nums.length -1];
		 return num;
		 }
	 public int start1(int[] a, int[] b) {
		 int count = 0;
		 if(a.length > 0 && a[0] == 1){
		 count++;
		 }
		 if(b.length > 0 && b[0] == 1){
		 count++;
		 }
		 return count;
		 }
	 public int[] fix23(int[] nums) {
		 for(int i = 0; i < nums.length - 1; i++) {
		 if(nums[i] == 2 && nums[i + 1] == 3){
		 nums[i + 1] = 0;
		 }
		 }
		 return nums;
		 }
	 public int start11(int[] a, int[] b) {
		 int count = 0;
		 if(a.length > 0 && a[0] == 1){
		 count++;
		 }
		 if(b.length > 0 && b[0] == 1){
		 count++;
		 }
		 return count;
		 }
	 public int[] biggerTwo(int[] a, int[] b) {
		 if(a[0] + a[1] < b[0] + b[1]){
		 return b;
		 }
		 return a;
		 }
	 public int[] plusTwo(int[] a, int[] b) {
		  int[] c = {a[0], a[1], b[0], b[1]};
		  return c;
		}
	 public int[] swapEnds(int[] nums) {
		 int first = nums[0];
		 nums[0] = nums[nums.length - 1];
		 nums[nums.length - 1] = first;
		 return nums;
		 }
	 public int[] frontPiece(int[] nums) {
		  if(nums.length < 2){
		    return nums;
		  }else{
		    int[] nums2 = {nums[0], nums[1]};
		    return nums2;
		  }
		}
	 public int[] frontPiece1(int[] nums) {
		  int[] nums2 = new int[2];
		  if(nums.length < 2){
		    nums2 = nums;
		  }else{
		    nums2[0] = nums[0];
		    nums2[1] = nums[1];
		  }
		  return nums2;
		}


}
