package chapter7;

//PROJECT 7.1
public class Coin {
	
	//constants for heads and tails
   public final int HEADS = 0;
   public final int TAILS = 1;

   //variable for face
   private int face;

   //Coin constructor
   public Coin ()
   {
      flip(); //calls flip method
   }

   //flip method that randomly generates a number
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   //getter method to get face value
   public int getFace ()
   {
	      return face;
   }

   //toString method
   public String toString()
   {
      String faceName;

      //checks if face and head are equal so it can set faceName
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
}
