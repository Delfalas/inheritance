package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(5406, "Vinicius", 1000.00);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance()); //conta de saque com taxa de 5 reais da classe account normal
		
		Account acc2 = new SavingsAccount(7002, "Maria", 1000.00, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(8001, "Laerte", 1000.00, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		
	}
}	
