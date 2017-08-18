package Expressive;

/**
 * Created by 申卓 on 2017/8/18.
 */
public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000 ;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        final long MICROS_PER_DAY2 = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY2 = 24L * 60 * 60 * 1000 ;
        System.out.println(MICROS_PER_DAY2 / MILLIS_PER_DAY2);


    }
}
