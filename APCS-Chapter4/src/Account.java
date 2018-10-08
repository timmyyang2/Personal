import java.text.NumberFormat;

public class Account { //PROJECT 4.1
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private final double RATE = 0.035;
    private long acctNumber;
    private double balance;
    private String name;

    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    public Account() {
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

    public void transfer (Account from, Account to, double amount, double fee){
        from.withdraw(amount, fee);
        to.deposit(amount);
    }
	
    public static void main(String[] args){
        Account defaultAccount = new Account();
        Account a = new Account("userA", 123, 200);
        Account b = new Account("userB", 234, 500);
        System.out.println(defaultAccount.getBalance());
        a.withdraw(100, 5);
        System.out.println(a.getBalance());
        b.deposit(100);
        System.out.println(b.getBalance());
    }
}