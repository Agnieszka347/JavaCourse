package pl.itacademy.week7.Bank;

import pl.itacademy.week7.account.Account;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private String name;
    private Set<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new HashSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getByNumber(long accountNumber) {
        for (Account account : accounts) {
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    public String getName() {
        return name;
    }
}
