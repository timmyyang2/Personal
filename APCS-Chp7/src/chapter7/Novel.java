package chapter7;

//PROJECT 7.3
public class Novel extends Book {
   protected String[] characters;

   public Novel(String title, String publisher, String author, String[] characters) {
      super(title, publisher, author);
      this.characters = characters;
   }

   public void setCharacters(String[] characters) {
      this.characters = characters;
   }
   
   public String[] getCharacters() {
      return characters;
   }
   
   public String toString() {
      String chars = super.toString();
      for(int i = 0; i < characters.length; i++) {
         chars += " " + characters[i];
   }
      System.out.print(chars);
      return chars;
   }
}
