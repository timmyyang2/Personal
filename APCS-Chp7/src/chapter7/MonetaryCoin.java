package chapter7;

//PROJECT 7.1
public class MonetaryCoin extends Coin { //MonetaryCoin class inherits from Coin class
   private int value;

   //Coin constructor
   public MonetaryCoin(int value) {
      super();
      this.value = value;
   }

   public void setValue(int value) {
      this.value = value;
   }

   public int getValue() {
      return value;
   }

   public String toString() {
      String str = super.toString();
      str += ": " + value;
      return str;
   }
}
