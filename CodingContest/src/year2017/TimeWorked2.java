package year2017;

public class TimeWorked2 {
	
	public static int convertMin(String[] times){
		int result = 0;
		try{
		
		for(int i=0; i<times.length; i++){
			if(times[i].charAt(2) != ':'){
				System.out.println("Invalid input, no :");
				System.exit(1);
			}
			int hr = Integer.parseInt(times[i].substring(0, 2));
			int min = Integer.parseInt(times[i].substring(3, 5));
			result = result + (hr*60) + min;
		}
		
		}catch(Exception e){
			System.out.println("Invalid input");
			System.exit(1);
		}
		return result;
	}
	
	public static void printConvertedResult(String[] args){
		int totalMin = convertMin(args);
		int hours = totalMin/60;
		int min = totalMin%60;
		if(min == 0){
			System.out.println(totalMin + " min = " + hours + " h ");
		}else{
			System.out.println(totalMin + " min = " + hours + " h " + min + " min ");
		}
	}
	public static void main(String[] args){
		printConvertedResult(args);
	}
}
