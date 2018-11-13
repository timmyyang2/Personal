package chapter6;

public class Tunes {
	
   public static void main (String[] args) {
     CDCollection music = new CDCollection();

      music.addCD ("Storm Front", "Joel, Billy", 14.95, 10);
      music.addCD ("Come On Over", "Twain, Shania", 14.95, 16);
      music.addCD ("Les Miserables", "Hugo, Victor", 17.95, 33);
      music.addCD ("Graceland", "Simon, Paul", 13.90, 11);
      music.addCD ("The Stranger", "Joel, Billy", 14.95, 12);
      music.addCD ("How Do You Like Me Now", "Keith, Toby", 15.49, 26);

      System.out.println (music);

      music.addCD ("Greatest Hits", "Buffet, Jimmy", 15.95, 13);
      music.addCD ("Breathe", "Hill, Faith", 16.45, 13);
      music.addCD ("Place In The Sun", "McGraw, Tim", 19.99, 26);
      music.addCD ("52nd Street", "Joel, Billy", 14.95, 11);
      music.addCD ("Double Live", "Brooks, Garth", 19.99, 26);
      music.addCD ("Fly", "Dixie Chicks", 14.99, 26);

      System.out.println (music);
   }
}
