import java.math.BigDecimal;

abstract class AmountToWord {
    BigDecimal amount;

    protected AmountToWord(){

    }

    static AmountToWord getConverter(AmountConversion conversion) throws Exception{
        switch (conversion){
            case BURMESE: {
                return new BurmeseAmountToWord();
            }
            case CHINESE: {
                return new ChineseAmountToWord();
            }
            case ENGLISH: {
                return new EnglishAmountToWord();
            }
            default:{
                throw new Exception("Conversion not found");
            }
        }
    }

    static AmountToWord getConverter(int amt, AmountConversion conversion) throws Exception{
        return getConverter(conversion).setAmount(amt);
    }
    static AmountToWord getConverter(double amt, AmountConversion conversion) throws Exception{
        return getConverter(conversion).setAmount(amt);
    }
    static AmountToWord getConverter(BigDecimal amt, AmountConversion conversion) throws Exception{
        return getConverter(conversion).setAmount(amt);
    }


    static String convertTo(int amt, AmountConversion conversion) throws Exception{
        return getConverter(conversion).setAmount(amt).convertInLetter();
    }
    static String convertTo(double amt, AmountConversion conversion) throws Exception{
        return getConverter(conversion).setAmount(amt).convertInLetter();
    }
    static String convertTo(BigDecimal amt, AmountConversion conversion) throws Exception{
        return getConverter(conversion).setAmount(amt).convertInLetter();
    }


    AmountToWord setAmount(int amt){
        amount = new BigDecimal(amt);
        return this;
    }
    AmountToWord setAmount(double amt){
        amount = new BigDecimal(amt);
        return this;
    }
    AmountToWord setAmount(BigDecimal amt){
        amount = amt;
        return this;
    }
    abstract String convert();
    abstract String convertInLetter();
}

enum AmountConversion {
    BURMESE,
    CHINESE,
    ENGLISH
}
