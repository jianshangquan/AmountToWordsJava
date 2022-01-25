package com.jiantech.AmountToWords;

public class Main {
    public static void main(String[] args) {
        AmountToWord convert = new BurmeseAmountToWord(123456789);
        System.out.println(convert.convert());
    }
}
