package courses.start;
/*
    Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
    - Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
    элементами, а затем выводить нужный элемент по его индексу на консоль.
*/

import java.util.Arrays;
import java.util.Scanner;

public class FlipArrayAndOutputElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        System.out.println(Arrays.toString(arr));
        ////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.nextLine();
        }
        while (true) {
            System.out.println(strArr[sc.nextInt()]);
        }
    }
}
