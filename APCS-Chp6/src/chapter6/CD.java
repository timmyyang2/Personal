package chapter6;

import java.text.NumberFormat;

public class CD implements Comparable {
	
   private String title, artist;
   private double value;
   private int tracks;

   public CD (String theTitle, String theArtist,
                      double theValue, int theTracks)
   {
      title = theTitle;
      artist = theArtist;
      value = theValue;
      tracks = theTracks;
   }

   public String toString(){
	      NumberFormat fmt = NumberFormat.getCurrencyInstance();

	      String description;

	      description = fmt.format(value) + "\t" + tracks + "\t";
	      description += artist + "\t" + title;

	      return description;
	   }

	   public int compareTo (Object obj)
	   {
	      CD other = (CD) obj;

	      int result = artist.compareTo (other.getArtist());
	      if (result == 0)
	         result = title.compareTo (other.getTitle());

	      return result;
	   }

	   public String getArtist()
	   {
	      return artist;
	   }

	   public String getTitle()
	   {
	      return title;
	   }

}
