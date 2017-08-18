package Expressive;

/**
 * Created by 申卓 on 2017/8/18.
 */

/**
 * 判断一个int是否为奇数
 * Java remainder %
 * a % b = a - ( a / b) * b  (b != 0)
 */
public class Oddity {
    public static boolean isOdd(int i) {
//        return i % 2 == 1;
//        return i % 2 != 0;
        return (i & 1) != 0;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(1));
        System.out.println(isOdd(8));
        System.out.println(isOdd(-3));
        System.out.println(isOdd(-2));
        System.out.println(isOdd(0));
    }
}
