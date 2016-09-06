package courses.start;

import java.util.Arrays;
import java.util.Random;

public class ArrayFrom100ToZero {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(8);
        }
        System.out.println(Arrays.toString(arr));
        int res = 0, cc, cp = 0;
        for (int i = 0; i < arr.length; i++) {
            cc = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    cc++;
            }
            if (cc > cp) {
                cp = cc;
                res = arr[i];
            }
        }
        System.out.println(res);
    }
}
