package year2015;
import java.util.ArrayList;

public class Compression {
	
	public static ArrayList<Integer> compress(String numbers){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int one = 0;
		int zero = 0;
		if(numbers.length()==1 && numbers.charAt(0)=='0'){
			result.add(1);
			return result;
		}
		if(numbers.length()==1 && numbers.charAt(0)=='1'){
			result.add(1);
		}
		for(int i=0; i<numbers.length()-1; i++){
			if(numbers.charAt(i)=='q' || numbers.charAt(i)=='Q'){
				System.exit(0);
			}
			if(numbers.charAt(i)=='0'){
				zero++;
				if(numbers.charAt(i+1)=='1'){
					result.add(zero);
					zero=0;
				}
				if(i+1==numbers.length()-1){
					zero++;
					result.add(zero);
				}
			}else if(numbers.charAt(i)=='1'){
				one++;
				if(numbers.charAt(i+1)=='0'){
					result.add(one);
					one=0;
				}
				if(i+1==numbers.length()-1){
					one++;
					result.add(one);
				}
			}
		}
		if(numbers.startsWith("1")){
			result.add(0, 0);
		}
		return result;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> myList = compress("1");
		System.out.print("OUTPUT: ");
		for(int j = 0; j<myList.size(); j++){
			System.out.print(myList.get(j) + " ");
		}
	}

}
