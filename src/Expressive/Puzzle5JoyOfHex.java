package Expressive;

/**
 * Created by 申卓 on 2017/8/18.
 */
public class Puzzle5JoyOfHex {
    public static void main(String[] args) {
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
    }
}
