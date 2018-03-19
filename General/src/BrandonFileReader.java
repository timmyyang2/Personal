import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BrandonFileReader {
    // Read and return a file content by passing the file pathname, throw an IO Exception if the file does not exist
    public static String textReader(String pathname) throws IOException { 
        File file = new File(pathname); // Create a file with the specified file pathname
        StringBuilder fileContents = new StringBuilder((int)file.length()); // Create a StringBuilder with the size of the file so that it can hold the entire file contents 
        Scanner scanner = new Scanner(file); // Create a scanner that scans the file
        String lineSeparator = System.getProperty("line.separator"); // Get the line separator of the OS system this program is running on for separating each read line
        
        // try block for reading the file contents using the scanner
        try {
            while(scanner.hasNextLine()) { // Read the file as long as it has the next line
                fileContents.append(scanner.nextLine() + lineSeparator); // Append each line into the StringBuilder with the line separator
            }
            return fileContents.toString(); // Convert the StringBuilder to the string to show the file contents
        }
        finally { // finally block for closing the scanner
            scanner.close(); // Close the scanner after done
        }
    }

    public static void main(String[] args){
    	String myFile = "C:\\Personal\\Computer Science\\notes.txt";
    	try {
			System.out.println(textReader(myFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
