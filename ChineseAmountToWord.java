package com.jiantech.AmountToWords;

import java.math.BigDecimal;

public class ChineseAmountToWord extends AmountToWord{
    ChineseAmountToWord(){

    }

    ChineseAmountToWord(int amt){
        amount = new BigDecimal(amt);
    }


    @Override
    public String convert() {
        return null;
    }

    @Override
    public String convertInLetter() {
        return null;
    }
}
