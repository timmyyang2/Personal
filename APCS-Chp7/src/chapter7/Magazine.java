package chapter7;

//PROJECT 7.3
public class Magazine extends Reading {
   protected int articles;

   public Magazine(String title, String publisher, int articles) {
      super(title, publisher);
       this.articles = articles;
   }

   public void setArticles(int articles) {
       this.articles = articles;
   }

   public int getArticles() {
      return articles;
   }

   public String toString() {
      String num = super.toString();
      System.out.println("Number of articles: " + articles);
      num += "Number of articles: " + articles;
      return num;
   }
}
