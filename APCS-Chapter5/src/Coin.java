
import java.util.Random;

public class Coin implements Lockable { //PROJECT 5.6 IS NOT FINISHED
	
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int face;
   private final int LOCK = 3;
   private boolean locked;
   private int userKey;

   public Coin() {
      locked = false;
      userKey = 0;
      flip();
   }

   public void flip() {
      if(!locked) {
         face = (int)(Math.random()*2);
      }
   }

   public boolean isHeads() {
      return (face == HEADS);
   }

   public String toString(){
      if(!locked) {
         String faceName;
         if (face == HEADS)
             faceName = "Heads";
          else
             faceName = "Tails";
          return faceName;
       }
       else
          return "Coin this locked";
    }

    public void setKey(int key) {
    	if(locked != true) {
    		userKey = key;
    	}
    }

    public void lock(int key) {
    	if(userKey!=key) {
    		locked = true;
    	}
    }

    public void unlock(int key) {
    	if(userKey==key) {
    		locked = false;
    	}
    }

    public boolean locked() {
       return locked;
    }

 }
