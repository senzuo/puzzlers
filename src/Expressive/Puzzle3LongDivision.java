package Expressive;

/**
 * Created by 申卓 on 2017/8/18.
 */
public class Puzzle3LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000 ;
        System.out.println("MICROS_PER_DAY is " + MICROS_PER_DAY);
        System.out.println("MILLIS_PER_DAY is " + MILLIS_PER_DAY);
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        final long MICROS_PER_DAY2 = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY2 = 24L * 60 * 60 * 1000 ;
        System.out.println(MICROS_PER_DAY2 / MILLIS_PER_DAY2);


    }
}
