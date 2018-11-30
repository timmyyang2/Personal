package chapter7;

//PROJECT 7.1
public class MonetaryCoin extends Coin { //MonetaryCoin class inherits from Coin class
   private int value;

   //MonetaryCoin class constructor
   public MonetaryCoin(int value) {
      super();
      this.value = value;
   }

   //setter method to set int value
   public void setValue(int value) {
      this.value = value;
   }

   //getter method to get int value
   public int getValue() {
      return value;
   }

   //toString method to print out coin info
   public String toString() {
      String str = super.toString();
      str += ": " + value;
      return str;
   }
}
