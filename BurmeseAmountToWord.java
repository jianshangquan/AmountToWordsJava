package com.jiantech.AmountToWords;

import java.math.BigDecimal;

public class BurmeseAmountToWord implements AmountToWord{
    public static final String[] unit = {"ခု", "ဆယ်", "ရာ", "ထောင်", "သောင်း", "သိန်း", "သန်း", "ကုဍ"};
    public static final String[] numbers = {"၁", "၂", "၃", "၄", "၅", "၆", "၇", "၈", "၉", "၀"};
    public static final String[] words = {"တစ်", "နှစ်", "သုံး", "လေး", "ငါး", "ခြှောက်", "ခုနှစ်", "ရှစ်", "ကိုး", "သုံည"};
    BigDecimal amount;

    BurmeseAmountToWord(){
        amount = new BigDecimal(0);
    }

    BurmeseAmountToWord(double amt){
        amount = new BigDecimal(amt);
    }

    BurmeseAmountToWord(BigDecimal amt){
        amount = amt;
    }


    public AmountToWord setAmount(BigDecimal amt){
        amount = amt;
        return this;
    }

    public AmountToWord setAmount(int amt){
        amount = new BigDecimal(amt);
        return this;
    }

    public AmountToWord setAmount(double amt){
        amount = new BigDecimal(amt);
        return this;
    }


    BurmeseAmountToWord(int amt){
        amount = new BigDecimal(amt);
    }

    @Override
    public String convert() {
        String amtString = amount.toString();
        String firstTheinAmt = amtString.substring(0, amtString.length() - 5);
        String lastTheinAmt = amtString.substring(amtString.length() < 6 ? 0 : amtString.length() - 6);
        String result = "";

        result = convertThein(lastTheinAmt);
        result = convertThein(firstTheinAmt) + result;
        result = result + lastTheinAmt.charAt(lastTheinAmt.length() - 1) + "ကျပ်";
        return result;
    }

    private String convertThein(String theinAmt){
        String result = "";
        for (int i = 0; i < theinAmt.length() - 1; i++){
            result = result + theinAmt.charAt(i) + unit[theinAmt.length() - i - 1];
            if(i == theinAmt.length() - 2) {
                result = result + "့";
            }
        }
        return result;
    }
}

// 123,456,789
//