package Expressive;

import java.math.BigDecimal;

/**
 * Created by 申卓 on 2017/8/18.
 */
public class TimeForChange {
    public static void main(String[] args) {
        System.out.println(2.00 - 1.10);
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
    }
}
