package com.syntax.class18;

public class AccountTester {
	public static void main(String[] args) {
		Account account = new Account();

		//System.out.println(account.username);
		//System.out.println(account.password);
		//System.out.println(account.balance);
		//System.out.println(account.accountNumber);

		/*
		 * accessing a field directly is different than accessing the same field with
		 * methods having different access modifiers
		 */

		// account.printUserName(); private access
		account.printBalance();
		account.printAccountNumber();
		account.printPassword();
		account.printUserName();
	}

}
