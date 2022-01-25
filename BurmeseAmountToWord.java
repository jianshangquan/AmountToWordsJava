package com.jiantech.AmountToWords;

import java.math.BigDecimal;

public class BurmeseAmountToWord implements AmountToWord{
    BigDecimal amount;

    BurmeseAmountToWord(int amt){
        amount = new BigDecimal(amt);
    }

    @Override
    public String convert() {
        return null;
    }
}
