package courses.start;

import java.util.Arrays;

public class MirrorReflectionArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            if(arr.length%2 == 0){
                arr[i] = (arr.length/2-i)*(-1);
                arr[arr.length-i-1] = Math.abs(arr[i]);
            }else{
                arr[i] = Math.abs(arr.length/2-i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
