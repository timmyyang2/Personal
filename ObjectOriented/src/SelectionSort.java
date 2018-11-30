
public class SelectionSort {
	
	int[] nums = {1,0,2,6,5,9,3,10};
	
	public void SSort(){
		for(int h = 0; h<nums.length; h++){
			System.out.println("Before sort: " + nums[h]);
		}
		for(int i = 0; i<nums.length-1; i++){
			for(int j = i; j<nums.length; j++){
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("");
		for(int k = 0; k<nums.length; k++){
			System.out.println("After sort: " + nums[k]);	
		}
	}
	
	public static void main(String[] args){
		SelectionSort mySort = new SelectionSort();
		mySort.SSort();
	}

}
