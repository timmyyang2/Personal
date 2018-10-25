public class TestCoin
{
   //-----------------------------------------------------------------
   //  Flips a coin multiple times and counts the number of heads
   //  and tails that result.  Locks and unlocks coins
	   public static void main (String[] args)
	   {
	      final int NUM_FLIPS = 25;
	      int key = 10;

	      Coin myCoin = new Coin();  // instantiate the Coin object
	      myCoin.setKey(key);

	      for (int count=1; count <= NUM_FLIPS; count++)
	      {
	         myCoin.flip();

	         System.out.println(myCoin);

	         if (count % 10 == 0)
	            myCoin.lock(key);
	         else
	            if (count % 5 == 0)
	               myCoin.unlock(key);

	      }

	   }
	}
