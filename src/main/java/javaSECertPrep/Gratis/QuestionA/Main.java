package javaSECertPrep.Gratis.QuestionA;

public class Main {
    static void main() {
        CheckingAccount acct = new CheckingAccount((int)Math.random()* 1000);
        //line n1
        //acct.changeAmount(0); //Doesn't Guarantee 0 balance
        //acct.amount=0; //Guarantees 0 balance
        //acct.changeAmount(-acct.getAmount()); //Guarantees 0 balance
        //acct.changeAmount(-acct.amount); //Guarantees 0 balance
        //this.amount =0;//this keyword cant be referenced from a static context
        System.out.println("Account balance "+acct.getAmount());
    }
}
