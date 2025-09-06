package BigDecimals;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest hundredth. For example, 4.2545 should return 4.25.
 * Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive, the result should be negative and vice versa), rounds the number to the nearest tenth and returns the result. For example, 1.2345 should return -1.2 and -45.67 should return 45.7.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(BigDec2Double(new BigDecimal("4.2545"), 2));
        System.out.println(BigDecReverse(new BigDecimal("1.2345")));
        System.out.println(BigDecReverse(new BigDecimal("-45.67")));
    }

    public static Double BigDec2Double(BigDecimal number, int scale) {
        return number.setScale(scale, RoundingMode.HALF_UP).doubleValue();
    }

    public static Double BigDecReverse(BigDecimal number) {
        return BigDec2Double(number.negate(), 1);
    }
}
