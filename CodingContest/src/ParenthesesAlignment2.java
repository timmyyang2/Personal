import java.util.ArrayList;

public class ParenthesesAlignment2 {
	
	public static boolean match(String input) {		
		ArrayList<Character> charList = new ArrayList<Character>();
		for(int i=0; i<input.length(); i++) {
			char currChar = input.charAt(i);
			if(currChar == '(' || currChar == '[' || currChar == '{') {
				charList.add(currChar);
				System.out.println("Push "+currChar);
			}else {
				if(!charList.isEmpty()) {
					if(currChar == ')') {
						if(charList.get(charList.size()-1) != '(') {
							return false;
						}else {
							System.out.println("Pop "+currChar);
							charList.remove(charList.size()-1);
						}
					}else if(currChar == ']') {
						if(charList.get(charList.size()-1) != '[') {
							return false;
						}else {
							System.out.println("Pop "+currChar);
							charList.remove(charList.size()-1);
						}
					}else if(currChar == '}') {
						if(charList.get(charList.size()-1) != '{') {
							return false;
						}else {
							System.out.println("Pop "+currChar);
							charList.remove(charList.size()-1);
						}
					}
				}else {
					return false;
				}
			}
		}
		return (charList.isEmpty());
	}
	
	public static void main(String[] args) {
		String input1 = "{[{([[[]]])}]}";
		String input2 = "{[{({[[]]}())}]}";
		System.out.println(input1+" is a match: "+match(input1));
		System.out.println(input2+" is a match: "+match(input2));
	}
}
