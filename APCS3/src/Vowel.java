import java.util.Scanner;

public class Vowel { //PROJECT 3.13	SPACE AND PUNCTUATION DOESNT WORK
	
	public static void printVowels() {
		int a = 0;
		int e = 0;
		int x = 0;
		int o = 0;
		int u = 0;
		int con = 0;
		int spa = 0;
		int pun = 0;
		String text = "";
		Scanner scan = new Scanner(System.in);
				 
		System.out.print("Enter string: ");
		text = scan.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			if (c=='a'){
			    a++;
			}else if (c=='e'){
			    e++;
			}else if (c=='i'){
			    x++;
			}else if (c=='o'){
			    o++;
			}else if (c=='u'){
				u++;
			}else if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
				con++;
			}else if (c==' '){
				spa++;
			}else if (c=='.' || c==',' || c==':' || c==';' || c=='!' || c=='?'){
				pun++;
			}else{
			}
		}
		  System.out.println("a: " + a + "\n" +
				    "e: " + e + "\n" +
				    "i: " + x + "\n" +
				    "o: " + o + "\n" +
				    "u: " + u + "\n" +
				    "consonants: " + con + "\n" +
				    "spaces: " + spa + "\n" +
				    "punctuation marks: " + pun + "\n");

	}
	

    public static void main(String args []){
    	printVowels();
    }       
}