package io.space.vipin;

public class Bank {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public Bank(){
        this(133,125,"default","default",15451);
        System.out.println("constructor");
    }
    public Bank(int accountNumber,int balance, String customerName, String email,long phoneNumber){
        System.out.println("constructor with parameter called");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }


    public void deposit(int amount){
        this.balance+= amount;
        System.out.println("Deposit of " + amount + "has been made: new amount is " + this.balance);
    }
    public void withdraw(int withAmount){
        if (this.balance-withAmount <0){
            System.out.println("Only " + this.balance + " is available, cannot withdraw");
        }else{
            this.balance-= withAmount;
            System.out.println("Withdrawal of " + withAmount + " has processed from your account: Remaining balance is "
                    + this.balance);
        }
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
}
