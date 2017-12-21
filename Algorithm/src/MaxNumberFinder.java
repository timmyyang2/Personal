
public class MaxNumberFinder {

	public static int getMax(int[] nums){
		if(nums.length == 0){
			System.out.println("No input");
			return -1;
		}
		int max = nums[0];
		for(int i=0; i<nums.length; i++){
			if(nums[i] > max){
				max = nums[i];		
			}
		}
		System.out.println("The max value is " + max);
		return max;
	}
	
	public static int getMax(String[] nums){
		if(nums.length == 0){
			System.out.println("No input");
			return -1;
		}
		int max = Integer.parseInt(nums[0]);
		for(int i=0; i<nums.length; i++){
			if(Integer.parseInt(nums[i]) > max){
				max = Integer.parseInt(nums[i]);		
			}
		}
		System.out.println("The max value is " + max);
		return max;
	}
	
	public static void main(String[] args){
		int[] nums = {12139,1231,129,88817};
		MaxNumberFinder.getMax(nums);
		MaxNumberFinder.getMax(args);
	}
}
