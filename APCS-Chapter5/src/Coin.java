import java.util.Random; //Random package for number generator

public class Coin implements Lockable { //PROJECT 5.6
	
   private final int HEADS = 0; //constant int HEADS is 0
   private final int TAILS = 1; //constant int TAILS is 1
   private int face; //int face
   private final int LOCK = 3; //constant int LOCK is 3
   private boolean locked; //boolean locked variable
   private int userKey; //int userKey

   public Coin() { //class constructor
      locked = false; //sets locked to false
      userKey = 0; //sets userKey to 0
      flip(); //calls flip method
   }

   public void flip() { //flip method
      if(!locked) { //if locked is false
         face = (int)(Math.random()*2); //random face number
      }
   }

   public boolean isHeads() { //boolean isHeads method
      return (face == HEADS); //returns if face is equal to HEADS
   }

   public String toString(){ //toString method
      if(!locked) { //if locked is false
         String faceName; //String faceName
         if (face == HEADS) //if face is equal to HEADS
             faceName = "Heads"; //set faceName as "Heads"
          else //else
             faceName = "Tails"; //set faceName as "Tails"
          return faceName; //returns faceName
       }
       else //else
          return "Coin this locked"; //returns "Coin this locked"
    }

    public void setKey(int key) { //setKey method
    	if(locked != true) { //if locked is not true
    		userKey = key; //assign userKey to key
    	}
    }

    public void lock(int key) { //lock method
    	if(userKey!=key) { //if userKey is not equal to key
    		locked = true; //assign true to locked
    	}
    }

    public void unlock(int key) { //unlock method
    	if(userKey==key) { //if userKey is equal to key
    		locked = false; //assign false to locked
    	}
    }

    public boolean locked() { //booleam locked method
       return locked; //returns locked
    }

 }
