package chapter7;

//PROJECT 7.3
public class Magazine extends Reading { //Magazine class inherits Reading class
   protected int articles; //int variable articles

   //Magazine class constructor
   public Magazine(String title, String publisher, int articles) {
      super(title, publisher);
       this.articles = articles;
   }

   //setter method to set int articles
   public void setArticles(int articles) {
       this.articles = articles;
   }

   //getter method to get int articles
   public int getArticles() {
      return articles;
   }

   //toString method to print out articles info
   public String toString() {
      String num = super.toString();
      System.out.println("Number of articles: " + articles);
      num += "Number of articles: " + articles;
      return num;
   }
}
