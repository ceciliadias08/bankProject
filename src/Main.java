import domain.Account;
import domain.Bank;
import domain.Chequing;
import domain.Savings;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Bank bankOfAmerica = new Bank();
        Scanner sc = new Scanner(System.in);

        //Control variable
        boolean executing = true;
        while (executing){
            System.out.println("\n==== BANK MENU ====");
            System.out.println("1. Create checking account");
            System.out.println("2. Create savings account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraws");
            System.out.println("5. Extract");
            System.out.println("6. List accounts");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println("""
                            Creating checking account
                            Enter the client name:
                            """);
                    String nameChequing = sc.nextLine();
                    Chequing clientChequingAccount = new Chequing(UUID.randomUUID().toString(), nameChequing);
                    bankOfAmerica.addAccount(clientChequingAccount);
                    break;

                case 2:
                    System.out.println("""
                             Creating savings account
                             Enter the client name:
                             """);
                    String nameSavings =  sc.nextLine();
                    Savings clientSavingsAccount =  new Savings(UUID.randomUUID().toString(), nameSavings);
                    bankOfAmerica.addAccount(clientSavingsAccount);
                    break;

                case 3:
                    System.out.println("""
                            Enter the account number:
                            """);
                    Account accountDeposit = bankOfAmerica.searchAccount(sc.nextLine());
                    if(accountDeposit != null){
                        System.out.println("""
                                Enter your deposit amount:
                                """);
                        double amountDeposit = sc.nextDouble();
                        accountDeposit.deposit(amountDeposit);
                    } else {
                        System.out.println("Account not found, try again");
                    }
                    break;

                case 4:
                    System.out.println("""
                            Enter the account number:
                            """);
                    Account accountWithdraw = bankOfAmerica.searchAccount(sc.nextLine());
                    if (accountWithdraw != null){
                        System.out.println("""
                                Enter your withdraw amount:
                                """);
                        double withdrawAmount = sc.nextDouble();
                        accountWithdraw.withdrawal(withdrawAmount);
                    } else {
                        System.out.println("Account not found, try again");
                    }
                    break;

                case 5:
                    System.out.println("""
                            Enter the account number:
                            """);
                    Account accountExtract = bankOfAmerica.searchAccount(sc.nextLine());
                    if (accountExtract != null){
                        accountExtract.total();
                    } else {
                        System.out.println("Account not found, try again");
                    }
                    break;

                case 6:
                    System.out.println("This is the list of accounts");
                    bankOfAmerica.listAccount();
                    break;

                case 7:
                    System.out.println("System closed");
                    executing = false;
                    break;

                default:
                    System.out.println("Your choice is not valid, try again.");
                    break;


            }
        } sc.close();
    }
}
