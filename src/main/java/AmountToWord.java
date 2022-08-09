import java.math.BigDecimal;

abstract class AmountToWord {
    BigDecimal amount;

    protected AmountToWord(){

    }

    static AmountToWord getConverter(AmountConvertion convertion) throws Exception{
        switch (convertion){
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

    static AmountToWord getConverter(int amt, AmountConvertion convertion) throws Exception{
        return getConverter(convertion).setAmount(amt);
    }
    static AmountToWord getConverter(double amt, AmountConvertion convertion) throws Exception{
        return getConverter(convertion).setAmount(amt);
    }
    static AmountToWord getConverter(BigDecimal amt, AmountConvertion convertion) throws Exception{
        return getConverter(convertion).setAmount(amt);
    }


    static String convertTo(int amt, AmountConvertion convertion) throws Exception{
        return getConverter(convertion).setAmount(amt).convertInLetter();
    }
    static String convertTo(double amt, AmountConvertion convertion) throws Exception{
        return getConverter(convertion).setAmount(amt).convertInLetter();
    }
    static String convertTo(BigDecimal amt, AmountConvertion convertion) throws Exception{
        return getConverter(convertion).setAmount(amt).convertInLetter();
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

enum AmountConvertion{
    BURMESE,
    CHINESE,
    ENGLISH
}
