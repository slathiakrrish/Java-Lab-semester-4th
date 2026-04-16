
class BankAccount {
    private double balance;  
    BankAccount(double balance) {
        this.balance = balance;
    }
    public double checkBalance() {
        return balance;
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful!");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }
    protected double getBalanceForSubclass() {
        return balance;
    }
}
class PremiumAccount extends BankAccount {
    PremiumAccount(double balance) {
        super(balance);
    }
    void showBalance() {
        System.out.println("Premium Account Balance: " + getBalanceForSubclass());
    }
}
public class codingproblemset6question2 {
    public static void main(String[] args) {
        BankAccount user = new BankAccount(1000);
        System.out.println("Balance: " + user.checkBalance());
        PremiumAccount premium = new PremiumAccount(2000);
        premium.showBalance();
    }
}