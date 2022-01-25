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
        System.out.println(amount.toString());
        String amtString = amount.toString();
        String theinAmt = amtString.substring(amtString.length() < 6 ? 0 : amtString.length() - 6);
        String result = "";

        System.out.println("============");

        result = convertThein(theinAmt);
        result = result + theinAmt.charAt(theinAmt.length() - 1) + "ကျပ်";
        return result;
    }

    private String convertThein(String theinAmt){
        String result = "";
        for (int i = 0; i < theinAmt.length() - 1; i++){
            result = result + theinAmt.charAt(i) + unit[theinAmt.length() - i - 1];
        }
        return result;
    }
}

// 123,456,789
//