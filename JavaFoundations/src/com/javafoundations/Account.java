package com.javafoundations;

import java.text.NumberFormat;

public class Account {
	
	private final double RATE = 0.035;
	
	private String name;
	private long accNumber;
	private double balance;
	
	public Account(String owner, long account, double initial){
		name = owner;
		accNumber = account;
		balance = initial;
	}
	
	public double deposit(double amount){
		if (amount > 0){
			balance = balance + amount;
		}
		return balance;
	}
		
	public double withdraw(double amount, double fee){
		if (amount+fee > 0 && amount+fee < balance){
			balance = balance - amount - fee;
		}else{
			System.out.println("This is an invalid transaction!");
		}
		return balance;
	}
	
	public double addInterest(){
		balance += (balance * RATE);
		return balance;
	}
	
	public double getBalance(){
		return balance;
	}
			
	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return (accNumber + "\t" + name + "\t" + fmt.format(balance));
	}
	
	public static void main(String[] args){
		Account tAccount = new Account("Timothy", 50, 50);
		tAccount.deposit(1.53);
		tAccount.withdraw(10, 0);
		System.out.println(tAccount.getBalance());
	}
}
		