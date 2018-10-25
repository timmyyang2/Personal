import java.text.NumberFormat;

public class Account implements Lockable {
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();
   private final double RATE = 0.035;  // interest rate of 3.5%
   private long acctNumber;
   private double balance;
   private String name;
   private int userKey;
   private boolean locked;

   public Account (String owner, long account)
   {
      name = owner;
      acctNumber = account;
      balance = 0.0;
      locked = false;
      userKey = 0;
   }

   public Account (String owner, long account, double initial)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
      locked = false;
      userKey = 0;
   }
   
   public static boolean transfer (double amount, double fee, Account from, Account to)
   {

      if (from.locked() || to.locked())
          return false;

       if (from.balance + fee < amount || amount < 0)
          return false;

       from.withdraw(amount, fee);
       to.deposit(amount);

       return true;
    }

    public double deposit (double amount)
    {
       if (locked)
          return balance;

       if (amount < 0)  // deposit value is negative
       {
          System.out.println ();
          System.out.println ("Error: Deposit amount is invalid.");
          System.out.println (acctNumber + "  " + fmt.format(amount));
       }
       else
          balance = balance + amount;

       return balance;
    }

    public double withdraw (double amount, double fee)
    {

       if (locked)
          return balance;

       amount += fee;

       if (amount < 0)  // withdraw value is negative
       {
          System.out.println ();
          System.out.println ("Error: Withdraw amount is invalid.");
          System.out.println ("Account: " + acctNumber);
          System.out.println ("Requested: " + fmt.format(amount));
       }
       else
          if (amount > balance)  // withdraw value exceeds balance
          {
             System.out.println ();
             System.out.println ("Error: Insufficient funds.");
             System.out.println ("Account: " + acctNumber);
             System.out.println ("Requested: " + fmt.format(amount));
             System.out.println ("Available: " + fmt.format(balance));
          }
             else
                 balance = balance - amount;

           return balance;
        }

        public double addInterest ()
        {
           if (locked)
              return balance;

           balance += (balance * RATE);
           return balance;
        }

        public double getBalance ()
        {
           return balance;
        }

        public long getAccountNumber ()
        {
           return acctNumber;
        }

        public String toString ()
        {
           return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
        }

        public void setKey(int key)
        {
           userKey = key;
        }

        public void lock(int key)
        {
           if (key == userKey)
              locked = true;
        }

        public void unlock(int key)
        {
           if (key == userKey)
              locked = false;
        }

        public boolean locked()
        {
           return locked;
        }
     }
