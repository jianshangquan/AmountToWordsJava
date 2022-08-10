import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        String result = AmountToWord.convertTo(new BigDecimal("1234567891011"), AmountConversion.BURMESE);
        System.out.println(result);
    }
}
