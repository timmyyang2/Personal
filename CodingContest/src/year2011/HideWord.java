package year2011;

public class HideWord {
	
	public static void word() {
		String one = "L O V E\n* * * *\n* * * *\n* * * *";
		String two = "L * * *\nO * * *\nV * * *\nE * * *";
		String three = "* * * *\n* * * *\n* * * *\nL O V E";
		String four = "* * * L\n* * * O\n* * * V\n* * * E";
		String five = "* * * *\nL O V E\n* * * *\n* * * *";
		String six = "* * * *\n* * * *\nL O V E\n* * * *";
		String seven = "* L * *\n* O * *\n* V * *\n* E * *";
		String eight = "* * L *\n* * O *\n* * V *\n* * E *";
		
		String[] strings = {one, two, three, four, five, six, seven, eight};
 
		for(int i = 0; i < 1; i++){
			int index = (int)(Math.random()*10);
			System.out.println(strings[index]);
		}
	}

	public static void main(String[] args) {
		word();
	}
}
