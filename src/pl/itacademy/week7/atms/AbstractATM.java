package pl.itacademy.week7.atms;

import pl.itacademy.week7.Bank.Card;


public abstract class AbstractATM {
    protected Card card;

    public void insertCard(Card card) {
        this.card = card;
    }

    public void endSession() {
        card = null;
    }

    public void changePin(String oldPin, String newPin) {
        if(card != null) {
            card.changePin(oldPin, newPin);
        } else {
            System.out.println("Insert card firstly!");
        }
    }
}
