import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        String result = AmountToWord.convertTo(new BigDecimal("123456789101"), AmountConversion.BURMESE);
        System.out.println(result);
    }
}
