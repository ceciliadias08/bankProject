package domain;

public class Chequing extends Account {

    private double interestMaintenance = 0.5;

    public Chequing(String accountNumber, String name) {
        super(accountNumber, name);
    }

    @Override
    public void total() {
        System.out.println("=== Extract ===");
        System.out.println("Número: " + accountNumber);
        System.out.println("Titular: " + name);
        System.out.println("Balance: $" + balance);
    }

}
