package year2017;

public class TimeWorked {
	
	public TimeWorked() {
		// TODO Auto-generated constructor stub
	}
	
	public int convertHours(int[] minutes){
		int result = 0;
		for(int i = 0; i<minutes.length; i++){
			result = result + minutes[i];
		}
		return result/60;
	}
	public int convertMinutes(int[] minutes) {
		int result = 0;
		for(int i = 0; i<minutes.length; i++){
			result = result + minutes[i];
		}
		return result%60;
	}
	
	public static void main(String[] args){
		TimeWorked myTime = new TimeWorked();
		int[] minutes = new int[args.length];
		for(int i = 0; i <args.length; i++){
			int hour = Integer.parseInt(args[i].substring(0, 2));;
			int minute = Integer.parseInt(args[i].substring(3, 5));;
			minutes[i] = (hour * 60) + minute;
		}
		int convertHour = myTime.convertHours(minutes);
		int convertMinute = myTime.convertMinutes(minutes);
		if(convertHour == 0 && convertMinute == 0){
			System.out.println("");
		}else if(convertHour == 0){
			System.out.println("Minutes: " + convertMinute);
		}else if(convertMinute == 0){
			 System.out.println("Hours: " + convertHour);
		}else{
			System.out.println("Hours: " + convertHour + " Minutes: " + convertMinute);
		}
	}
}
