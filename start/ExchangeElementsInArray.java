package courses.start;

import java.util.Arrays;

public class ExchangeElementsInArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,3,5,2,1,5,7,6,10};
        int i = arr[8];
        arr[8] = arr[0];
        arr[0] = i;
        System.out.println(Arrays.toString(arr));
    }
}
