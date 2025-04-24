package OOPs;

class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder(){
        return getAccountHolder();
    }
    public double getBalance() {
        return getBalance();
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount >0){
            balance +=amount;
            System.out.println("Deposited:"+amount);
        } else {
            System.out.println(" Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount:"+amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }
}
