
public class ParenthesesAlignment {
	
	public static boolean inputValue(String input){
		if(input.length() <= 0){
			return false;
		}
		if(input.startsWith("]") || input.startsWith("}") || input.startsWith(")")){
			return false;
		}
		if(input.length() % 2 == 1){
			return false;
		}
		for(int i = 0; i < input.length(); i++){	
			if(input.charAt(i) != '{' && input.charAt(input.length()-1-i) == '}' || 
					input.charAt(i) != '[' && input.charAt(input.length()-1-i) == ']' ||
					input.charAt(i) != '(' && input.charAt(input.length()-1-i) == ')'){
						return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args){
		System.out.println(ParenthesesAlignment.inputValue("([{}])"));
	}
}
