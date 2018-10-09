package proj4_2; //package project 4.2
import java.text.NumberFormat; //import NumberFormat package
import java.util.Scanner;

public class Account2 { //Account class
	//assigns and initializes private variables
    private NumberFormat fmt = NumberFormat.getCurrencyInstance(); //number format
    private final double RATE = 0.035; //rate
    private long acctNumber; //account number
    private double balance; //balance
    private String name; //name

    //Account constructor w/ parameters owner, account, and initial
    public Account2(String owner, long account, double initial) {
        name = owner; //assigns owner to name
        acctNumber = account; //assigns account to acctNumber
        balance = initial; //assigns initial to balance
    }
    
    //Account constructor
    public Account2() {
        name ="N/A"; //defines name as String
        acctNumber = 0; //sets acctNumber to 0
        balance = 0.0; //sets balance to 0.0
    }
    
    //deposit method w/parameter amount
    public double deposit (double amount) {
        if (amount < 0){ //if amount is less than 0
            System.out.println(); //space
            System.out.println("Error: Deposit amount is invalid."); //prints out error message
            System.out.println(acctNumber + " " + fmt.format(amount)); //prints out acctNumber and the amount
        }
        else { //else
            balance = balance + amount; //new balance is balance + amount
        }
        return balance; //returns balance
    }
    
    //withdraw method w/ parameter amount and fee
    public double withdraw (double amount, double fee) {
        amount += fee; //add fee to account
        if (amount < 0){ //if account is less than 0
	        System.out.println(); //space
	        System.out.println("Error: Withdraw amount is invalid."); //prints out error message
	        System.out.println("Account: " + acctNumber); //prints out account number
	        System.out.println("Requested: " + fmt.format(amount)); //prints out requested
        }
        else //else
        if (amount > balance){ //if amount > balance
	        System.out.println(); //space
	        System.out.println("Error: Insufficient funds."); //prints out
	        System.out.println("Account: " + acctNumber); //prints out
	        System.out.println("Requested: " + fmt.format(amount)); //prints out requested amount
	        System.out.println("Available: " + fmt.format(balance)); //prints out available balance
        }
        else { //else
        	balance = balance - amount; //new balance is balance - amount
        }
        return balance; //returns balance
    }
    
    public double addInterest () { //addInterest method
        balance += (balance * RATE); //new balance is balance * RATE
        return balance; //returns balance
    }
    
    public String getName () { //getName method
        return name; //returns name
    }
    
    public double getBalance () { //getBalance method
        return balance; //returns balance
    }
    
    public long getAccountNumber () { //getAccountNumber method
        return acctNumber; //returns acctNumber
    }
    
    public String toString () { //toString method
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance)); //returns account info
    }

    public void transfer (Account2 from, Account2 to, double amount, double fee){ //transfer method w/ multiple parameters
        from.withdraw(amount, fee); //puts amount and fee into withdraw
        to.deposit(amount); //deposits amount
    }

    public void openAccount(String name, long acctNumber) { //openAccount method w/ parameters name and acctNumber
    	this.balance = 0; //sets balance to 0
    	this.name = name; //sets name to name
    	this.acctNumber = acctNumber; //sets acctNumber to acctNumber
    }
	
    public static void main(String[] args){ //main method
        Account2 myAcc = new Account2(); //new Account2 object
        Scanner sc = new Scanner(System.in); //Scanner for user input
		System.out.print("Enter name: "); //asks user for name
		String name = sc.nextLine(); //user input line
		System.out.print("Enter account number: "); //asks user for acct number
		long acctNumber = sc.nextLong(); //user input line
        myAcc.openAccount(name, acctNumber); //calls openAccount
        System.out.println("Name: " + myAcc.getName()); //prints out name
        System.out.println("Account Number: " + myAcc.getAccountNumber()); //prints out account number
        System.out.println("Balance: " + myAcc.getBalance()); //prints out balance of 0
    }
}