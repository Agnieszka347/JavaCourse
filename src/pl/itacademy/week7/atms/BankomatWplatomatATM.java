package pl.itacademy.week7.atms;

import java.math.BigDecimal;

public class BankomatWplatomatATM extends AbstractATM implements Bankomat, Wplatomat{

    @Override
    public BigDecimal withDraw(BigDecimal amount) {
        return null;
    }

    @Override
    public BigDecimal topUp(BigDecimal amount) {
        return null;
    }

}
