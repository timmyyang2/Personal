package chapter7;

//PROJECT 7.1
public class MonetaryCoinDriver { //driver class for coin classes

   public static void main(String[] args) {
	   //new MonetaryCoin object with 4 items
      MonetaryCoin[] coins = new MonetaryCoin[4];
      coins[0] = new MonetaryCoin(1);
      coins[1] = new MonetaryCoin(5);
      coins[2] = new MonetaryCoin(10);
      coins[3] = new MonetaryCoin(25);
      
      //loops through and flips coin
      for(int i = 0; i < coins.length; i++) {
         coins[i].flip();
      }

      //loops through to get coin value
      int count = 0;
      for(int i = 0; i < coins.length; i++) {
         count += coins[i].getValue();
      }

      //loops through to print out coin
      for(int i = 0; i < coins.length; i++) {
         System.out.println(coins[i]);
      }
      
      //prints final count of coins
      System.out.println ("\nSum of all: " + count);
   }
}
