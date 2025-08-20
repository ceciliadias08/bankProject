package domain;

public class Savings extends Account{
    private double interest = 10.0;

    public Savings(String accountNumber, String name) {
        super(accountNumber, name);
    }

    @Override
    public void total() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Número: " + accountNumber);
        System.out.println("Titular: " + name);
        System.out.println("Saldo: R$" + balance);
        System.out.println("Taxa de manutenção mensal: R$" + interest);
    }

    // Method to Yield interest
    public void earnInterest(){
        double amount = balance * interest;
        balance += amount;
        System.out.println("Your earnings for this month is " + amount + " your total balance is " + balance);
    };


}
