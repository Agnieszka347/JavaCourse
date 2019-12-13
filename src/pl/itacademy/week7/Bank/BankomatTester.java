package pl.itacademy.week7.Bank;

import pl.itacademy.week7.account.Account;
import pl.itacademy.week7.account.CreditAccount;
import pl.itacademy.week7.account.DebitAccount;

import java.math.BigDecimal;

public class BankomatTester {

    public static void main(String[] args) {
        Bank ing = new Bank("ING");
        Bank pko = new Bank( "PKO");
        BankRegistrator.registerBank(ing);
        BankRegistrator.registerBank(pko);

        Account debitAccount = new DebitAccount();
        Account creditAccount = new CreditAccount(BigDecimal.valueOf(1000));
        ing.addAccount(debitAccount);
        ing.addAccount(creditAccount);
        pko.addAccount(debitAccount);
        pko.addAccount(creditAccount);

        System.out.println(debitAccount.getAccountNumber());
        System.out.println(creditAccount.getAccountNumber());

        Card debitCard = new Card("123", ing.getName(), debitAccount.getAccountNumber());
        Card creditCard = new Card("234", ing.getName(), creditAccount.getAccountNumber());

        //create accounts
        //create banks
        //create cards. put account numbers into cards
        //put bank names into cards
        //register accounts in banks
        //register banks in bank registrator
        //
        //create different ATMs (bankomat, wplatomat, bankomat+wplatomat)
        // try to top-up, withdraw different cards with different bankomats

        System.out.println(debitAccount.toString());

        debitCard.topUp(BigDecimal.valueOf((1000)));
        creditAccount.topUp(BigDecimal.valueOf(1001));

        System.out.println(debitAccount.toString());
        System.out.println(debitCard.toString());

       /* System.out.println("===End of initialization testing block===");
        atmWithdraw atm1 = new atmWithdraw();
        atm1.insertCard(debitCard);
        atm1.topUp(BigDecimal.valueOf(100));
        System.out.println(debitAccount.toString());
        atm1.withdraw(BigDecimal.valueOf(300));
        System.out.println(debitAccount.toString());
        atm1.insertCard(creditCard);
        atm1.insertCard(creditCard);
        atm1.topUp(BigDecimal.valueOf(500));
        System.out.println(creditAccount.toString());
        atm1.withdraw(BigDecimal.valueOf(10000));
        System.out.println(creditAccount.toString());
        atm1.withdraw(BigDecimal.valueOf(1000));
        System.out.println(creditAccount.toString());
        System.out.println("Credit balance: " + creditCard.checkBalance());
        System.out.println("Debit balance: " + debitCard.checkBalance());*/
    }
}






