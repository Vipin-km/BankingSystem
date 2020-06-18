package io.space.vipin;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank();//(123, 100, "Vipin", "vipinkm2@gmail.com", 9172789);

		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getCustomerName());
		System.out.println(bank.getBalance());




	bank.deposit(1000);
	bank.withdraw(100);
	bank.withdraw(1999);





    }
}
