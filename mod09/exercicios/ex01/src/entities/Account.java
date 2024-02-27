package entities;

public class Account {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = 0.0;
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void deposit(double value){
        this.accountBalance += value;
    }

    public void withdraw(double value){
        this.accountBalance -= (value + 5.0); 
    }

    public String toString(){
        return "Account " + this.getAccountNumber() + 
        ", Holder: " + this.getAccountHolder() + 
        ", Balance: $" + String.format("%.2f", getAccountBalance());
    }


}
