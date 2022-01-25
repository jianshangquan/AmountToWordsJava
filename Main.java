package com.jiantech.AmountToWords;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        String result = AmountToWord.convertTo( 123456780, AmountConvertion.BURMESE);
        System.out.println(result);
    }
}
