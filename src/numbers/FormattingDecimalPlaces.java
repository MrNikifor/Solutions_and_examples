package numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormattingDecimalPlaces {
    public static void main(String[] args) {

    }
    public static double TwoDecimalPlaces(double number) {
       BigDecimal bg = new BigDecimal(number).setScale(2, RoundingMode.HALF_UP);;
       return bg.doubleValue();
    }
    public static double TwoDecimalPlaces1(double number)
    {
        return Double.parseDouble(String.format("%.2f", number));
    }
    public static double TwoDecimalPlaces2(double number)
    {
        //Write your code here
        return (Math.round(number*100))/
                100.0;
    }
}
