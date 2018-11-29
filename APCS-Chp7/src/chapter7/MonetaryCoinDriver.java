package chapter7;

//PROJECT 7.1
public class MonetaryCoinDriver {

   public static void main(String[] args) {
      MonetaryCoin[] coins = new MonetaryCoin[7];
      coins[0] = new MonetaryCoin(1);
      coins[1] = new MonetaryCoin(5);
      coins[2] = new MonetaryCoin(10);
      coins[3] = new MonetaryCoin(25);
      
      for(int i = 0; i < coins.length; i++) {
         coins[i].flip();
      }

      int count = 0;
      for(int i = 0; i < coins.length; i++) {
         count += coins[i].getValue();
      }

      for(int i = 0; i < coins.length; i++) {
         System.out.println(coins[i]);
      }
      
      System.out.println ("\nSum of all: " + count);
   }
}
