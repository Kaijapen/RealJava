public class BankAccount {
    private int numOfAccounts = 0;
    private double numOfMoney = 0;
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    private Long accountNum;

    public BankAccount(double cBalanceParam, double sBalanceParam){
        checkingBalance = cBalanceParam;
        savingsBalance = sBalanceParam;
        accountNum = this.makeAccountNum();
        numOfAccounts++;
        numOfMoney += checkingBalance + savingsBalance;
    }

    private Long makeAccountNum(){
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        return number;
    }

    public Long getAccountNum(){
        return this.accountNum;
    }

    public double getChecking() {
        return this.checkingBalance;
    }

    public double getSavings() {
        return this.savingsBalance;
    }

    public void deposit(String account, double amount){
        if (account == "savings"){
            this.savingsBalance += amount;
        } else if (account == "checking"){
            this.checkingBalance += amount;
        }
        else {
            throw new IllegalArgumentException("Must be 'savings' or 'checking'");
        }
        numOfMoney += amount;
    }

    public void withdraw(String account, double amount){
        if (account == "savings"){
            if(this.savingsBalance < amount){
                String sAmount = String.format("%,.2f", this.savingsBalance);
                System.out.println("Not enough money in Savings. Only $" + sAmount + ("available."));
            } else {
                String cAmount = String.format("%,.2f", this.checkingBalance);
                System.out.println("Not enough money in Checking. Only $" + cAmount + ("available."));
            }
        }
    }

    public void showAllBalance(){
        double total = this.checkingBalance + this.savingsBalance;
        String tAmount = String.format("%,.2f", total);
        String sAmount = String.format("%,.2f", this.savingsBalance);
        String cAmount = String.format("%,.2f", this.checkingBalance);
        System.out.println("Checking: $" + cAmount);
        System.out.println("Savings: $" + sAmount);
        System.out.println("Total Balance: $" + tAmount);
    }
}
