
public class BubbleSort {
	
	int[] nums = {1,0,2,6,5,9,3,10};
	
	public void BSort(){
		for(int h = 0; h<nums.length; h++){
			System.out.println("Before sort: " + nums[h]);
		}
		for(int i = 0; i<nums.length-1; i++){
			for(int j = i; j<nums.length-1; j++){
				if(nums[j] > nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println("");
		for(int k = 0; k<nums.length; k++){
			System.out.println("After sort: " + nums[k]);	
		}
	}
	
	public static void main(String[] args){
		BubbleSort mySort = new BubbleSort();
		mySort.BSort();
	}
}
