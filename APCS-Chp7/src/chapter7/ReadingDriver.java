package chapter7;

//PROJECT 7.3
public class ReadingDriver { //driver class for reading materials

   public static void main(String[] args) {
      Reading[] reading = new Reading[6]; //new reading object with 6 items

      //6 Reading objects with inputs and characters array
      reading[0] = new Reading("Word Power", "Nashua South");
      reading[1] = new Book("Hi AP Java", "Comp Sci", "Sahil Code");
      String[] characters = { "Sid", "Sahil", "Deji", "KSI", "Rice" };
      reading[2] = new Novel("YouTubers", "YouTube", "Google", characters);
      reading[3] = new Magazine("TIME", "TIME Inc.", 10);
      reading[4] = new TechJournal("Google Tesla", "Elon Musk", "Car");
      reading[5] = new Textbook("Campbell Biology", "Campbell", "Mr. Campbell", true);
      
      //loop to print out info
      for(int i = 0; i < reading.length; i++) {
         reading[i].toString();
         System.out.println();
      }
   }
}
