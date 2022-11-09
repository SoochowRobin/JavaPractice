public class SuperClassTest02 {

    public static void main(String[] args) {
        CreditAccount a1 = new CreditAccount();
        System.out.println(a1.getAccountNum() +" "+a1.getBalance() +" "+ a1.getCreditNum());
        CreditAccount a2 = new CreditAccount("1111", 100, 1000);
        System.out.println(a2.getAccountNum() +" "+a2.getBalance() +" "+ a2.getCreditNum());
    }

}
/*
use account as super class and credit account as subclass
 */

class Account{
    private String accountNum;
    private double balance;

    // you had better always write no parameter constructor
    public Account(){}

    public Account(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


class CreditAccount extends Account{
    private double creditNum;

    public CreditAccount() {
        super();
    }

    public CreditAccount(String accountNum, double balance, double creditNum){
        super(accountNum, balance);
        this.creditNum = creditNum;
    }

    public double getCreditNum() {
        return creditNum;
    }

    public void setCreditNum(double creditNum) {
        this.creditNum = creditNum;
    }
}


