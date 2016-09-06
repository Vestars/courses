package courses.start;

import java.util.Arrays;

public class UnitedArrays {
    public static int[] unitedArrays(int[] first, int[] second) {
        int[] united = new int[first.length + second.length];
        System.arraycopy(first,0,united,0,first.length);
        System.arraycopy(second,0,united,first.length,second.length);
        Arrays.sort(united);
        return united;
    }

    public static void main(String[] args) {
        int[] first = new int[5];
        int[] second = new int[5];
        for (int i = 0; i < first.length; i++) {
            first[i] = i * 2;
            second[i] = i * 3;
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(unitedArrays(first, second)));
    }
}
