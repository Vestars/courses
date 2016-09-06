package courses.start;

import java.util.Arrays;
import java.util.Scanner;

public class OneArrayToTwoArrays {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        int[] arr1 = Arrays.copyOf(arr,5);
        Arrays.sort(arr1);
        int[] arr2 = Arrays.copyOfRange(arr,5,10);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
