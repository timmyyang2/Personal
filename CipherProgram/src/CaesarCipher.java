import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
    	Random rand = new Random();
    	int key = rand.nextInt(26)+1;
        
        String strKey = Integer.toString(key);
        
        if (key < 10){
            strKey = '0' + strKey;
            System.out.println(strKey);
        }
        
        char firstDigit = strKey.charAt(0);
        char secondDigit = strKey.charAt(1);
        
        String firstString = "";
        String secondString = "";
        
        String fileName = "temp.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            int i = 0;
            while (i<20){
                firstString = firstString + rand.nextInt(10);
                secondString = secondString + rand.nextInt(10);
                i = i + 1;
            }
            char[] myNameChars = firstString.toCharArray();
            myNameChars[4] = firstDigit;
            firstString = String.valueOf(myNameChars);
            
            myNameChars = secondString.toCharArray();
            myNameChars[9] = secondDigit;
            secondString = String.valueOf(myNameChars);
            
            
            
            bufferedWriter.write(firstString);
            bufferedWriter.newLine();
            bufferedWriter.write(secondString);
            bufferedWriter.newLine();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter what you want to encrypt: ");
            String message = scanner.nextLine();
            String encrypted_message = Cipher.encrypt(Integer.parseInt(strKey), message);
            bufferedWriter.write(encrypted_message);

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
        
        
        
        
    }
    
}
