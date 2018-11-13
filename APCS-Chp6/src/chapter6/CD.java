package chapter6; //package name

import java.text.NumberFormat; //imports number format package

public class CD implements Comparable { //class

	//defines variables
   private String title, artist;
   private double value;
   private int tracks;

   //class constructor initializes variables
   public CD (String theTitle, String theArtist,
                      double theValue, int theTracks)
   {
      title = theTitle;
      artist = theArtist;
      value = theValue;
      tracks = theTracks;
   }

   //toString method to print out cd information
   public String toString(){
	      NumberFormat fmt = NumberFormat.getCurrencyInstance();

	      String description;

	      description = fmt.format(value) + "\t" + tracks + "\t";
	      description += artist + "\t" + title;

	      return description;
	   }

   //compareTo method to arrange cds in order
	   public int compareTo (Object obj)
	   {
	      CD other = (CD) obj;

	      int result = artist.compareTo (other.getArtist());
	      if (result == 0)
	         result = title.compareTo (other.getTitle());

	      return result;
	   }
//method that gets artist name
	   public String getArtist()
	   {
	      return artist;
	   }
//method that gets title
	   public String getTitle()
	   {
	      return title;
	   }

}
