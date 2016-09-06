package courses.start;

import java.util.Arrays;
import java.util.Random;

public class NotRepeatNumbs {
    public static void reload(int[] arr) {
        int cc;
        for (int i = 0; i < arr.length; i++) {
            cc = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cc++;
                }
            }
            if(cc == 1) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        reload(arr);
    }
}
