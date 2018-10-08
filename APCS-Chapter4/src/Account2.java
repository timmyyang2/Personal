import java.text.NumberFormat;
import java.util.Scanner;

public class Account2{ //PROJECT 4.2
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private final double RATE = 0.035;
    private long acctNumber;
    private double balance;
    private String name;

    public Account2(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    public Account2() {
        name ="N/A";
        acctNumber = 0;
        balance = 0.0;
    }
    
    public double deposit (double amount) {
        if (amount < 0){
            System.out.println();
            System.out.println("Error: Deposit amount is invalid.");
            System.out.println(acctNumber + " " + fmt.format(amount));
        }
        else {
            balance = balance + amount;
        }
        return balance;
    }
    
    public double withdraw (double amount, double fee) {
        amount += fee;
        if (amount < 0){
        System.out.println();
        System.out.println("Error: Withdraw amount is invalid.");
        System.out.println("Account: " + acctNumber);
        System.out.println("Requested: " + fmt.format(amount));
        }
        else
        if (amount > balance){
        System.out.println();
        System.out.println("Error: Insufficient funds.");
        System.out.println("Account: " + acctNumber);
        System.out.println("Requested: " + fmt.format(amount));
        System.out.println("Available: " + fmt.format(balance));
        }
        else {
        balance = balance - amount;
        }
        return balance;
    }
    
    public double addInterest () {
        balance += (balance * RATE);
        return balance;
    }
    
    public String getName () {
        return name;
    }
    
    public double getBalance () {
        return balance;
    }
    
    public long getAccountNumber () {
        return acctNumber;
    }
    
    public String toString () {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }

    public void openAccount(String name, long acctNumber) {
    	this.balance = 0;
    	this.name = name;
    	this.acctNumber = acctNumber;
    }
	
    public static void main(String[] args){
        Account2 myAcc = new Account2();
        Scanner sc = new Scanner(System.in); 
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter account number: ");
		long acctNumber = sc.nextLong();
        myAcc.openAccount(name, acctNumber);
        System.out.println("Name: " + myAcc.getName());
        System.out.println("Account Number: " + myAcc.getAccountNumber());
        System.out.println("Balance: " + myAcc.getBalance());
    }
}