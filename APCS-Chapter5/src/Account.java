import java.text.NumberFormat; //NumberFormat package for number formatting

public class Account implements Lockable { //Account class implements Lockable interface
   private NumberFormat fmt = NumberFormat.getCurrencyInstance(); //fmt variable
   private final double RATE = 0.035;  // interest rate of 3.5%
   private long acctNumber; //variable for acctNumber
   private double balance; //variable for balance
   private String name; //variable for name
   private int userKey; //variable for userKey
   private boolean locked; //boolean for locked condition

   public Account (String owner, long account){ //constructor
      name = owner; //name is owner
      acctNumber = account; //actNumber is account
      balance = 0.0; //balance is 0.0
      locked = false; //locked is set to false
      userKey = 0; //userKey is set to 0
   }

   public Account (String owner, long account, double initial){ //second constructor
      name = owner; //name is owner
      acctNumber = account; //actNumber is account
      balance = initial; //balance is set to initial
      locked = false; //locked is set to false
      userKey = 0; //userKey is set to 0
   }
   
    public double deposit (double amount){ //deposit method
       if (locked) { //check if locked 
          return balance; //returns balance
       }
       if (amount < 0) { //deposit value is negative
          System.out.println (); //space
          System.out.println ("Error: Deposit amount is invalid."); //error message
          System.out.println (acctNumber + "  " + fmt.format(amount)); //prints acctNumber and amount
       }
       else //else
          balance = balance + amount; //add amount to balance

       return balance; //return balance
    }

    public double withdraw (double amount, double fee){ //withdraw method
       if (locked) { //check if locked
          return balance; //returns balance
       }
       amount += fee; //adds fee to amount
       if (amount < 0) {  //withdraw value is negative
          System.out.println (); //space
          System.out.println ("Error: Withdraw amount is invalid."); //error message
          System.out.println ("Account: " + acctNumber); //prints acctNumber
          System.out.println ("Requested: " + fmt.format(amount)); //prints requested amount
       } else if (amount > balance) { //withdraw value exceeds balance
             System.out.println (); //space
             System.out.println ("Error: Insufficient funds."); //error message
             System.out.println ("Account: " + acctNumber); //prints acctNumber
             System.out.println ("Requested: " + fmt.format(amount)); //prints requested amount
             System.out.println ("Available: " + fmt.format(balance)); //prints available balance
          }else //else
                 balance = balance - amount; //subtract amount from balance
           return balance; //returns balance
        }

        public double addInterest (){ //add interest method
           if (locked) { //check if locked
              return balance; //returns balance
           }
           balance += (balance * RATE); //adds balance * RATE to balance
           return balance; //returns balance
        }

        public double getBalance (){ //getBalance method
           return balance; //returns balance
        }

        public long getAccountNumber (){ //getAccountNumber method
           return acctNumber; //returns acctNumber
        }

        public String toString (){ //toString method
           return (acctNumber + "\t" + name + "\t" + fmt.format(balance)); //prints account info
        }

        public void setKey(int key){ //setKey method
           userKey = key; //sets userKey == key
        }

        public void lock(int key){ //lock method
           if (key == userKey) //if key is equal to userKey
              locked = true; //it is locked
        }

        public void unlock(int key){ //unlock method
           if (key == userKey) //if key is equal to userKey
              locked = false; //locked is false
        }

        public boolean locked(){ //boolean locked method
           return locked; //returns locked
        }
     }
