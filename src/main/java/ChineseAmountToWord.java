import java.math.BigDecimal;

public class ChineseAmountToWord extends AmountToWord{
    public static final String[] unit = {"", "十", "百", "千", "万"};
    public static final String[] numbers = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "零"};

    ChineseAmountToWord(){

    }

    ChineseAmountToWord(int amt){
        amount = new BigDecimal(amt);
    }


    @Override
    public String convert() {
        // TODO: implement chinese word
        return null;
    }

    @Override
    public String convertInLetter() {
        return null;
    }
}
