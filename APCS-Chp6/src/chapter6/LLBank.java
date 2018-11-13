package chapter6;

import java.text.NumberFormat;

public class LLBank { //PROJECT 6.6
	
	//assigns and initializes private variables
    private NumberFormat fmt = NumberFormat.getCurrencyInstance(); //number format
    private long acctNumber; //account number
    private double balance; //balance
    private String name; //name
    int count = 0;

    //Account constructor w/ parameters owner, account, and initial
    public LLBank(String owner, long account, double initial) {
        name = owner; //assigns owner to name
        acctNumber = account; //assigns account to acctNumber
        balance = initial; //assigns initial to balance
    }
    
    //Account constructor
    public LLBank() {
        name ="N/A"; //defines name as String
        acctNumber = 0; //sets acctNumber to 0
        balance = 0.0; //sets balance to 0.0
    }
    
    //deposit method w/parameter amount
    public double deposit (double amount) {
        if (count < 30 && amount < 0){ //if amount is less than 0
            System.out.println(); //space
            System.out.println("Error: Deposit amount is invalid."); //prints out error message
            System.out.println(acctNumber + " " + fmt.format(amount)); //prints out acctNumber and the amount
        }
        else { //else
            balance = balance + amount; //new balance is balance + amount
            count++;
        }
        return balance; //returns balance
    }
    
    //withdraw method w/ parameter amount and fee
    public double withdraw (double amount, double fee) {
        amount += fee; //add fee to account
        if (count < 30 && amount < 0){ //if account is less than 0
	        System.out.println(); //space
	        System.out.println("Error: Withdraw amount is invalid."); //prints out error message
	        System.out.println("Account: " + acctNumber); //prints out account number
	        System.out.println("Requested: " + fmt.format(amount)); //prints out requested
        }
        else if (amount > balance){ //if amount > balance
	        System.out.println(); //prints an empty line
	        System.out.println("Error: Insufficient funds."); //prints out error message
	        System.out.println("Account: " + acctNumber); //prints out account number
	        System.out.println("Requested: " + fmt.format(amount)); //prints out requested amount
	        System.out.println("Available: " + fmt.format(balance)); //prints out available balance
        }
        else { //else
        	balance = balance - amount; //new balance is balance - amount
            count++;
        }
        return balance; //returns balance
    }
    
    public double addInterest () { //addInterest method
        balance += (balance * 1.03); //new balance is balance * RATE
        return balance; //return balance
    }
    
    public String getName () { //getName method
        return name; //return name
    }
    
    public double getBalance () { //getBalance method
        return balance; //returns balance
    }
    
    public long getAccountNumber () { //getAccountNumber method
        return acctNumber; //returns acctNumber
    }
    
    public String toString() { //toString method
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance)); //returns account info
    }
}
