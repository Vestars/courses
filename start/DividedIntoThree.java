package courses.start;

//      Вывести на экран все числа от 1 до 100, которые
//      делятся на 3 без остатка.


import java.util.Arrays;
import java.util.Random;

public class DividedIntoThree {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println("Max: " + max + "\nMin: " + min);

    }
}
