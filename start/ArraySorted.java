package courses.start;


import java.util.Arrays;
import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
