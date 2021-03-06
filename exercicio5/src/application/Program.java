package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.next();

		Account account;

		System.out.print("Is there na initial deposit (y/n)? ");
		sc.next();
		char sel = sc.next().charAt(0);
		if ((sel == 'Y') || (sel == 'y')) {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			account = new Account(number, holder, amount);

		} else {
			account = new Account(number, holder);
		}

		System.out.println("Account data: ");
		System.out.println(account);
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);

		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();

	}

}
