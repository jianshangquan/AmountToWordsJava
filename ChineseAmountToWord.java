package com.jiantech.AmountToWords;

import java.math.BigDecimal;

public class ChineseAmountToWord implements AmountToWord{

    BigDecimal amount;

    ChineseAmountToWord(int amt){
        amount = new BigDecimal(amt);
    }



    @Override
    public String convert() {
        return null;
    }
}
