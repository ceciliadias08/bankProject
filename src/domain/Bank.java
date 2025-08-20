package domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> account = new ArrayList<>();

    public void addAccount(Account account){
        this.account.add(account);
        System.out.println("Your account was successfully added, your account number is " + account.getAccountNumber());
    }

    public Account searchAccount(String incomingNumber) {
        for (Account acc : account) {
            if (acc.getAccountNumber().equals(incomingNumber)) {
                return acc;
            }
        } return null;
    }

    //To list account
    public void listAccount(){
        for (Account acc : account){
            System.out.println(acc.getClass().getSimpleName() + " Name: " + acc.getName() +
                    " Account number: " + acc.getAccountNumber() +
                    " Balance: " + acc.getBalance());
        }
    }


}
