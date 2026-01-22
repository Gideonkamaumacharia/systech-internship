package PracticeExercises.Wk2Day2;

public class BankAccount {
    //properties/fields using encapsulation
    private String accountNumber; //this.accountNumber
    private String accountHolder;
    private double balance;


    //No args constructor
            //Exists under the hood
            //Can be explicitly created though, like shown below
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

    //Getters & Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

        if (accountNumber == null) {
            System.out.println("Account number cannot be null");
            return;
        }
        if(accountNumber.length() < 5 || accountNumber.length() >10){
            System.out.println("Invalid account number.Must be 5-10 digits!");
        }
        //loop ensures
        for(int i =0;i < accountNumber.length();i++){
            if (!Character.isDigit(accountNumber.charAt(i))) {
                System.out.println("Account number must contain only digits");
                return;
            }
        }
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.isBlank()) {
            System.out.println("Account holder name is required");
            return;
        }

        for (char c : accountHolder.toCharArray()) {
            if (Character.isDigit(c)) {
                System.out.println("Name cannot contain numbers");
                return;
            }
        }

        this.accountHolder = accountHolder.trim();
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Initial balance must be zero or more");
            return;
        }
            //Added Math.round() to round a float or double to the nearest integer
        this.balance = Math.round(balance * 100.0) / 100.0;
    }


    //other general custom methods
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Kshs " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive");
        }
    }

    public void withdraw(double amount){
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
        } else if(amount > balance){
            System.out.println("Error: Insufficient funds or invalid amount");
        }else{
            balance -= amount;
            System.out.println("Withdrawn: kshs " + amount);
        }
    }
    public void displayBalance(){
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: Kshs " + balance);
    }
}
