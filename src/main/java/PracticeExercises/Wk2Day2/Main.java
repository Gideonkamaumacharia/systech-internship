package PracticeExercises.Wk2Day2;

public class Main {
    public static void main(String[] args) {
        //Created a BankAccount object and used the constructor with all parameters
        BankAccount bankAccount = new BankAccount("09114578","Mhusika John",45000);
//        bankAccount.deposit(12000);
//        bankAccount.withdraw(10000);
//        bankAccount.displayBalance();

        //Created a BankAccount object and used the constructor with accountNumber and accountHolder parameters
        BankAccount bankAccount1 = new BankAccount("8586969","John Mhusika",15000);
//        bankAccount1.deposit(16000);
//        bankAccount1.withdraw(8000);
//        bankAccount1.displayBalance();

        //Using getters and setters
        String accountHolder = bankAccount1.getAccountHolder();
        //System.out.println("Account Holder: "+ accountHolder);

        double balance = bankAccount1.getBalance();
        System.out.println("The balance for "+ bankAccount1.getAccountHolder() + " is " + balance + ". His account number is "+ bankAccount1.getAccountNumber());

        BankAccount account = new BankAccount(); // no-args constructor

        account.setAccountNumber(null); //this diplays "Account number cannot be null" in the terminal
        account.setAccountHolder("Gideon Kamau");
        account.setBalance(25000);

        account.deposit(5000);
        account.withdraw(3000);

        //account.displayBalance();

    }

}
