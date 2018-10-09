package proj4_1; //package project 4.1
import java.text.NumberFormat; //import NumberFormat package

public class Account { //Account class
	//assigns and initializes private variables
    private NumberFormat fmt = NumberFormat.getCurrencyInstance(); //format
    private final double RATE = 0.035; //rate
    private long acctNumber;
    private double balance;
    private String name;

    //Account constructor w/ parameters owner, account, inital
    public Account(String owner, long account, double initial) {
        name = owner; //assigns name to owner
        acctNumber = account; //assigns acctNumber to account
        balance = initial; //assigns balance to initial
    }
    
    //Account constructor
    public Account() {
        name ="N/A"; //defines name as String
        acctNumber = 0; //sets acctNumber to 0
        balance = 0.0; //sets balance to 0.0
    }
    
    //deposit method w/parameter amount
    public double deposit (double amount) {
        if (amount < 0){ //if amount is less than 0
            System.out.println(); //space
            System.out.println("Error: Deposit amount is invalid."); //error message
            System.out.println(acctNumber + " " + fmt.format(amount)); //prints out acctNumber and the amount
        }
        else { //else
            balance = balance + amount; //new balance is balance + amount
        }
        return balance; //return balance
    }
    
    //withdraw method w/ parameter amount and fee
    public double withdraw (double amount, double fee) {
        amount += fee; //add fee to account
        if (amount < 0){ //if account is less than 0
        System.out.println(); //space
        System.out.println("Error: Withdraw amount is invalid."); //error message
        System.out.println("Account: " + acctNumber); //prints out
        System.out.println("Requested: " + fmt.format(amount)); //prints out
        }
        else //else
        if (amount > balance){ //if amount > balance
        System.out.println(); //space
        System.out.println("Error: Insufficient funds."); //prints out
        System.out.println("Account: " + acctNumber); //prints out
        System.out.println("Requested: " + fmt.format(amount)); //prints out requested amount
        System.out.println("Available: " + fmt.format(balance)); //prints out avaiable balance
        }
        else { //else
        balance = balance - amount; //new balance is balance - amount
        }
        return balance; //return balance
    }
    
    public double addInterest () { //addInterest method
        balance += (balance * RATE); //new balance is balance * RATE
        return balance; //return balance
    }
    
    public String getName () { //getName method
        return name; //return name
    }
    
    public double getBalance () { //getBalance method
        return balance; //return balance
    }
    
    public long getAccountNumber () { //getAccountNumber method
        return acctNumber; //return acctNumber
    }
    
    public String toString () { //toString method
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance)); //return account info
    }

    public void transfer (Account from, Account to, double amount, double fee){ //transfer method w/ multiple parameters
        from.withdraw(amount, fee); //puts amount and fee into withdraw
        to.deposit(amount); //deposits amount
    }
	
    public static void main(String[] args){ //main method
        Account defaultAccount = new Account(); //new Account object
        Account a = new Account("userA", 123, 200); //account a
        Account b = new Account("userB", 234, 500); //account b
        System.out.println(defaultAccount.getBalance()); //prints out account info
        a.withdraw(100, 5); //puts amount and fee into withdraw
        System.out.println(a.getBalance()); //prints out balance
        b.deposit(100); //deposits 100
        System.out.println(b.getBalance()); //prints out balance
    }
}