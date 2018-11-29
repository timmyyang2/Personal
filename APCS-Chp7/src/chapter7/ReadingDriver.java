package chapter7;

//PROJECT 7.3
public class ReadingDriver {

   public static void main(String[] args) {
      Reading[] reading = new Reading[6];

      reading[0] = new Reading("Word Power", "Nashua South");
      reading[1] = new Book("Hi AP Java", "Comp Sci", "Sahil Code");
      String[] characters = { "Sid", "Sahil", "Deji", "KSI", "Rice" };
      reading[2] = new Novel("YouTubers", "YouTube", "Google", characters);
      reading[3] = new Magazine("TIME", "TIME Inc.", 10);
      reading[4] = new TechJournal("Google Tesla", "Elon Musk", "Car");
      reading[5] = new Textbook("Campbell Biology", "Campbell", "Mr. Campbell", true);
      
      for(int i = 0; i < reading.length; i++) {
         reading[i].toString();
         System.out.println();
      }
   }
}
