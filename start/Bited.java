package courses.start;

import java.util.Arrays;

/**
 * Created by Дмитрий on 20.06.2016.
 */
public class Bited {
    static void bitSet(int[] a, int pos) {
        a[pos / 32] = (a[pos / 32]) | (1 << pos % 32);
        return;
    }

    static int bitGet(int[] a, int pos) {
        return (((a[pos / 32]) & (1 << pos % 32)) > 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] a = new int[5];

        bitSet(a, 1);
        bitSet(a, 15);
        bitSet(a, 33);
        bitSet(a, 55);

        System.out.println(Arrays.toString(a));

        System.out.println(bitGet(a, 15));
        System.out.println(bitGet(a, 33));
        System.out.println(bitGet(a, 16));
        System.out.println(bitGet(a, 35));

    }
}
