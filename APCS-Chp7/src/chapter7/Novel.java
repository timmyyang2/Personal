package chapter7;

//PROJECT 7.3
public class Novel extends Book { //Novel class inherits Book class
   protected String[] characters; //String array variable characters

   //Novel class constructor
   public Novel(String title, String publisher, String author, String[] characters) {
      super(title, publisher, author);
      this.characters = characters;
   }

   //setter method to set String array characters
   public void setCharacters(String[] characters) {
      this.characters = characters;
   }
   
   //getter method to get String array characters
   public String[] getCharacters() {
      return characters;
   }
   
   //toString method to print out characters info
   public String toString() {
      String chars = super.toString();
      for(int i = 0; i < characters.length; i++) {
         chars += " " + characters[i];
   }
      System.out.print(chars);
      return chars;
   }
}
