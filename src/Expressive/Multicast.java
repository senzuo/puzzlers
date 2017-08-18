package Expressive;

/**
 * Created by 申卓 on 2017/8/18.
 */
public class Multicast {
    public static void main(String[] args) {
        int a = -1;
        byte b = (byte)a;
        char c = (char)b;
        int d = (int)c;

        System.out.printf("%x\n",a);
        System.out.printf("%d\n",a);
        System.out.printf("%x\n",b);
        System.out.printf("%d\n",b);
        System.out.println(c+"");
//        System.out.printf("%x\n",c);
//        System.out.printf("%d\n",c);
        System.out.printf("%x\n",d);
        System.out.printf("%d\n",d);
        System.out.println("顶顶顶");

        System.out.println("\ufffe\u00ff");

    }
}
