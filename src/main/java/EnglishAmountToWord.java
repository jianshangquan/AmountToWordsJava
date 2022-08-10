import java.math.BigDecimal;

public class EnglishAmountToWord extends AmountToWord{
    public static final String[] unit = {"", "", "Hundred", "Thousand"};
    public static final String[] twentiesUnit = {
            "",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen"
    };
    public static final String[] tenUnits = {
            "",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety"
    };
    public static final String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Zero"};

    @Override
    String convert() {
        // TODO: Implement english word
        return null;
    }

    @Override
    String convertInLetter() {
        return null;
    }

    @Override
    boolean isValidAmount(BigDecimal amt) {
        return false;
    }
}
