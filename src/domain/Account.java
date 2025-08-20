package domain;

//Abstract: just a matrix
public abstract class Account {
    //Protected: the classes inside the package can access
    // Public: can be access in the whole program, and external programs
    // Private: can be access only on the class

    protected String accountNumber;
    protected String name;
    protected double balance;

    public Account(String accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0;
    }

    //get: method that allow just "seeing" the information
    //method classe's action
    // visibility returnType methodsName

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println("The total balance on account " + accountNumber + " is " + balance);
        } else {
            System.out.println("Deposit invalid, try again.");
        }
    }

    public void withdrawal(double amount){
        if (amount <= balance && amount > 0){
            balance-=amount;
            System.out.println("The current amount on account " + accountNumber + " is " + balance);
        } else {
            System.out.println("Withdrawal invalid, try again.");
        }
    }

    public abstract void total();


}