package application;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Vinicius", 1000.00, 500.0);
		
		System.out.println(account.getBalance());
	}
}