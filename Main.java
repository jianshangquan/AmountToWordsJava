package com.jiantech.AmountToWords;

public class Main {
    public static void main(String[] args) throws Exception {
        String result = AmountToWord.convertTo( 123456780, AmountConvertion.CHINESE);
        System.out.println(result);
    }
}
