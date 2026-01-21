package PracticeExercises.Wk2Day2;

public class BankAccount {
    //properties/fields
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("09114578","Mhusika John",45000);
        bankAccount.depositAmount();
    }

    //constructors
            // -->a no args constructor goes here.Exists under the hood
    //constructor with accountNumber and accountHolder
    public BankAccount(String accountNumber,String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void depositAmount(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ksh" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    public void displayBalance(){
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}
