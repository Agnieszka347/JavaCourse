package pl.itacademy.week7.Bank;

import java.util.HashSet;
import java.util.Set;

public class BankRegistrator {

    private static Set<Bank> banks = new HashSet<>();

    private BankRegistrator() {
    }

    public static void registerBank(Bank bank) {
        banks.add(bank);
    }

    public static Bank getByName(String bankName) {
        for (Bank bank : banks) {
            if(bank.getName().equals(bankName)) {
                return bank;
            }
        }
        return null;
    }

}
