package PracticeExercises.Wk2Day2;

public class BankAccount {
    //properties/fields
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public static void main(String[] args) {
        //Created a BankAccount object and used the constructor with all parameters
        BankAccount bankAccount = new BankAccount("09114578","Mhusika John",45000);
//        bankAccount.depositAmount(12000);
//        bankAccount.withdraw(10000);
//        bankAccount.displayBalance();

        //Created a BankAccount object and used the constructor with accountNumber and accountHolder parameters
        BankAccount bankAccount1 = new BankAccount("8586969","John Mhusika",15000);
        bankAccount1.depositAmount(16000);
        bankAccount1.withdraw(8000);
        bankAccount1.displayBalance();
    }

    //constructors
            // -->a no args constructor goes here.Exists under the hood
            //Can be explicitly created though like shown below
    public BankAccount(){
    }

    //constructor with accountNumber and accountHolder
    public BankAccount(String accountNumber,String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    //constructor with all the properties(Constructor overloading)
    public BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void depositAmount(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Kshs " + amount);
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: kshs " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }
    public void displayBalance(){
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: Kshs " + balance);
    }
}
