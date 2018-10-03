
public class Banking{ //PROJECT 4.1 (driver class)
	
    public static void transfer (Account from, Account to, double amount, double fee){
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