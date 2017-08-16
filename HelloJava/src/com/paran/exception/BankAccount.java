package com.paran.exception;

public class BankAccount {
	private AccountHolder owner;
	long balance;

	public long withdraw(long amount) throws BalanceNotEnoughException {
		if (balance - amount <= 0) {
			throw new BalanceNotEnoughException("잔액이 부족합니다.");
		}
		balance = balance - amount;
		return amount;
	}

	public void deposite(long amount) {
		balance = balance + amount;
	}
	
	public void checkBalance() {
		System.out.println("잔액 : "+balance);
	}
	
	public static void main(String[] args) {
		AccountHolder ah = new AccountHolder("김","kim");
		BankAccount bAcount = new BankAccount();
		bAcount.owner = ah;
		bAcount.balance = 100;
		
		try {
			bAcount.checkBalance();
			bAcount.withdraw(20);
			bAcount.checkBalance();
			bAcount.deposite(30);
			bAcount.checkBalance();
			bAcount.withdraw(120);
		} catch (BalanceNotEnoughException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

class AccountHolder {
	String ownerName;
	String ownerId;
	String accountNo;

	public AccountHolder(String ownerName, String ownerId) {
		this.ownerName = ownerName;
		this.ownerId = ownerId;
	}
}

class BalanceNotEnoughException extends Exception {
	public BalanceNotEnoughException() {
		super();
	}

	public BalanceNotEnoughException(String message) {
		super(message);
	}
	
	public BalanceNotEnoughException(String message, long amount) {
		super(message+" ["+amount+"원 출금 불가]");
	}
}
