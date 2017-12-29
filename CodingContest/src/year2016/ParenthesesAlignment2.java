package year2016;
import java.util.ArrayList;

public class ParenthesesAlignment2 {

	public static boolean bracketMatch(String input) {	
		ArrayList<Character> bracket = new ArrayList<Character>();
		for(int i=0; i<input.length(); i++) {
			char current = input.charAt(i);
			if(current == '{' || current == '[' || current == '(') {
				bracket.add(current);
			}else if(!bracket.isEmpty()) {
				if(current == '}') {
					if(bracket.get(bracket.size()-1) != '{') {
						return false;
					}else{
						bracket.remove(bracket.size()-1);
					}
				}else if(current == ']') {
					if(bracket.get(bracket.size()-1) != '[') {
						return false;
					}else{
						bracket.remove(bracket.size()-1);
					}
				}else if(current == ')') {
					if(bracket.get(bracket.size()-1) != '(') {
						return false;
					}else{
						bracket.remove(bracket.size()-1);
					}
				}
			}else{
				return false;
			}
		}
		return bracket.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(ParenthesesAlignment2.bracketMatch("()(){}{}{[[]]}"));
	}
}
