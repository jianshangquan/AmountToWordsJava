package com.jiantech.AmountToWords;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        AmountToWord convert = new BurmeseAmountToWord(12345678);
        System.out.println(convert.convert());
    }
}
